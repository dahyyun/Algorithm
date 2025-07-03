import java.io.*;
import java.math.BigInteger;
import java.util.function.LongToIntFunction;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());

        int count = 0;
        int num = 0;
        int[] arr = new int[max - min + 1];

        for (int i = min; i < max + 1; i++) {
            if (isPrime(i)) {
                arr[num] = i;
                num++;
                count += i;
            }
        }

        if(count == 0) {
            bw.write(-1 + "");
        } else {
            bw.write(count + "\n" + arr[0]);
        }


        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int n) {
        if(n < 2) return false;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }

        return true;
    }
}
