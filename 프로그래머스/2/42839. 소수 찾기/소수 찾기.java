import java.util.*;

class Solution {
    Set<Integer> candidates = new HashSet<>();
    
    public int solution(String numbers) {
        
        permutation(numbers, "", new boolean[numbers.length()]);
        
        int count = 0;
        
        for(int num : candidates) {
            if(isPrime(num)) count ++;
        }
        
        return count;  
    }
    
    void permutation(String numbers, String current, boolean[] visited) {
        if(!current.equals("")) {
            candidates.add(Integer.parseInt(current));
        }
        
        for(int i = 0; i < numbers.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                permutation(numbers, current + numbers.charAt(i), visited);
                visited[i] = false;
            }
        }
    }
    
    boolean isPrime(int n) {
        if(n < 2) return false;
        
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }
        
        return true;
            
    }
}