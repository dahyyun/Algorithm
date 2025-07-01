import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int a = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");

        int count = 0;

        for(int i = 0; i < a; i++) {
            int num = Integer.parseInt(arr[i]);

            if(isPrime(num)) {
                count ++;
            }
        }

        bw.write(count + "");

        bw.flush();
        bw.close();
    }

    private static boolean isPrime(int num) {

        if(num < 2) return false;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }

        return true;
    }
}
