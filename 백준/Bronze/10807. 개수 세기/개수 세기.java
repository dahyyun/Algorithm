import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = bf.readLine().trim();
        int s = Integer.parseInt(str);

        String[] arr = (bf.readLine()).split(" ");
        int[] a = new int[s];

        for(int i = 0; i < s; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }

        String string = bf.readLine().trim();
        int v = Integer.parseInt(string);

        int count = 0;

        for(int i = 0; i < s; i++) {
            if (a[i] == v) {
                count++;
            }
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();

    }
}
