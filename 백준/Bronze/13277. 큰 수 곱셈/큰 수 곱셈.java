import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = bf.readLine().split(" ");

        BigInteger a = new BigInteger(arr[0]);
        BigInteger b = new BigInteger(arr[1]);

        BigInteger sum = a.multiply(b);

        bw.write(sum + "");

        bw.flush();
        bw.close();
    }
}
