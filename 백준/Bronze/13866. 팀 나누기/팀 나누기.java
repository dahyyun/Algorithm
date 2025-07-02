import java.io.*;
import java.math.BigInteger;
import java.util.function.LongToIntFunction;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int d = Integer.parseInt(arr[3]);

        int sum1 = a + d;
        int sum2 = b + c;

        int total = 0;

        if(sum1 >= sum2) {
            total = sum1 - sum2;
        } else {
            total = sum2 - sum1;
        }

        bw.write(total + "");

        bw.flush();
        bw.close();
    }
}
