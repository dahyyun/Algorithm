import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[30];

        for(int i = 0; i < 30; i++) {
            arr[i] = (i + 1);
        }

        for(int i = 0; i < 28; i++) {
            String str = bf.readLine().trim();
            int s = Integer.parseInt(str);
            arr[s - 1] = 0;
        }

        for(int i = 0; i < 30; i++) {
            if(arr[i] != 0) {
                bw.write(arr[i] + "\n");
            }
        }

        bw.flush();
        bw.close();

    }
}
