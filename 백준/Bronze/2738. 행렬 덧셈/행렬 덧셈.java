import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = (bf.readLine().trim()).split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        int[][] a1b1 = new int[a][b];

        for(int i = 0; i < a; i++) {
            String[] b1 = (bf.readLine().trim()).split(" ");
            for(int j = 0; j < b; j++) {
                a1b1[i][j] = Integer.parseInt(b1[j]);
            }
        }

        int[][] a2b2 = new int[a][b];

        for(int i = 0; i < a; i++) {
            String[] b1 = (bf.readLine().trim()).split(" ");
            for(int j = 0; j < b; j++) {
                a2b2[i][j] = Integer.parseInt(b1[j]);
            }
        }

        int[][] sum = new int[a][b];

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                sum[i][j] = a1b1[i][j] + a2b2[i][j];
            }
        }

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                bw.write(sum[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();

    }
}
