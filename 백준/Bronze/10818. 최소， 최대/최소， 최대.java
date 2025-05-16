import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = bf.readLine().trim();
        int s = Integer.parseInt(str);

        String[] arr = (bf.readLine()).split(" ");

        int[] ar = new int[s];

        for(int i = 0; i < s; i++) {
            ar[i] = Integer.parseInt(arr[i]);
        }

        int max = ar[0];
        int min = ar[0];

        for(int i = 0; i < s; i++) {
            if(max < ar[i]) {
                max = ar[i];
            } else if (min > ar[i]) {
                min = ar[i];
            } else {

            }
        }

        bw.write(min + " " + max);


        bw.flush();
        bw.close();

    }
}
