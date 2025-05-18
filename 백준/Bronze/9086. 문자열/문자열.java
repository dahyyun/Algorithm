import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bf.readLine());

        for(int i = 0; i < a; i++) {
            String[] arr = (bf.readLine()).split("");
            bw.write(arr[0] + arr[arr.length - 1] + "\n");
        }


        bw.flush();
        bw.close();
    }
}
