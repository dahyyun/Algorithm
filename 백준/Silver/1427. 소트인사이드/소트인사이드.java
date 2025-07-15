import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        Integer[] digits = new Integer[N.length()];
        for (int i = 0; i < N.length(); i++) {
            digits[i] = N.charAt(i) - '0';
        }

        Arrays.sort(digits, Collections.reverseOrder());
        
        for (int digit : digits) {
            System.out.print(digit);
        }
    }
}
