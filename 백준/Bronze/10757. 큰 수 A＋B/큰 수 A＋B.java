import java.io.*;
import java.math.BigInteger;
import java.util.function.LongToIntFunction;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        BigInteger bigNumber1 = new BigInteger(arr[0]);
        BigInteger bigNumber2 = new BigInteger(arr[1]);

        BigInteger bigNumber3 = bigNumber1.add(bigNumber2);

        bw.write(bigNumber3 + "");

        bw.flush();
        bw.close();
    }
}
