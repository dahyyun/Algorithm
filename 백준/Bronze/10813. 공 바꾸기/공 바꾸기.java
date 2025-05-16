import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = (bf.readLine()).split(" ");
        int a = Integer.parseInt(str[0]);
        int b =Integer.parseInt(str[1]);

        int[] arr = new int[a];

        for(int i = 0; i < a; i++) {
            arr[i] = (i + 1);
        }

        for(int i = 0; i < b; i++) {
            String[] s = (bf.readLine()).split(" ");

            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            int temp = 0;

            temp = arr[y - 1];
            arr[y - 1] = arr[x - 1];
            arr[x - 1] = temp;

        }

        for(int i = 0; i < a; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();

    }
}
