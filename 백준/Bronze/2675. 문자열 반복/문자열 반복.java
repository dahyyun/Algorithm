import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bf.readLine());

        for (int i = 0; i < a; i++) {
            String[] arr = (bf.readLine()).split(" ");

            int num = Integer.parseInt(arr[0]);

            String[] brr = (arr[1].split(""));

            for (int j = 0; j < brr.length; j++) {
                for(int k = 0; k < num; k++) {
                    bw.write(brr[j]);
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
