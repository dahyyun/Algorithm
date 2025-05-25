import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = (bf.readLine().trim()).split(" ");

        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);

        int w = Integer.parseInt(arr[2]);
        int h = Integer.parseInt(arr[3]);

        int xw = w - x;
        int yh = h - y;


        int[] ar = new int[4];

        ar[0] = x;
        ar[1] = y;
        ar[2] = xw;
        ar[3] = yh;

        int min = ar[0];

        for(int i = 0; i < 4; i++) {
            if(min > ar[i]) {
                min = ar[i];
            }
        }

        bw.write(min + "");

        bw.flush();
        bw.close();
    }
}
