import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a = new int[9];

        int max = a[0];

        int j = 0;

        for(int i = 0; i < 9; i++) {
            String str = bf.readLine().trim();
            a[i] = Integer.parseInt(str);

            if(max < a[i]) {
                max = a[i];
                j = i;
            }
        }

        bw.write(max + "\n" + (j + 1));


        bw.flush();
        bw.close();

    }
}
