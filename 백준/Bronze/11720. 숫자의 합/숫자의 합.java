import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bf.readLine());

        String[] arr = (bf.readLine()).split("");

        int sum = 0;

        int[] ar = new int[a];

        for (int i = 0; i < a; i++) {
            ar[i] = Integer.parseInt(arr[i]);
            sum += ar[i];
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
    }
}
