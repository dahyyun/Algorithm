import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = bf.readLine().split(" ");

        int a = Integer.parseInt(arr[0]);
        int avg = Integer.parseInt(arr[1]);

        int b = 2 * avg - a;

        bw.write(b + "");

        bw.flush();
        bw.close();
    }
}
