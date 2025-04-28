package Practice;

public class PrimeNums {

    public static void main(String[] args) {
        PrimeNums primeNums = new PrimeNums();

        int[] nums1 = {1, 2, 3, 4};
        int result1 = primeNums.solution(nums1);
        System.out.println("Result 1: " + result1); // 기대 출력: 1

        int[] nums2 = {1, 2, 7, 6, 4};
        int result2 = primeNums.solution(nums2);
        System.out.println("Result 2: " + result2); // 기대 출력: 4
    }

    public int solution(int[] nums) {
        int result = 0;

        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    private boolean isPrime(int num) {
        if(num < 2) return false;


        // 어떤 수의 약수는 √n 이하의 수와 반드시 짝을 이루니까, √n까지만 보면 된다!

        for(int i = 2; i <= (int)Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

}
