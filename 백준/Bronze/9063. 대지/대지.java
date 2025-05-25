import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bf.readLine().trim());

        int[] x = new int[a];
        int[] y = new int[a];

        for(int i = 0; i < a; i++) {
            String[] arr = (bf.readLine().trim()).split(" ");
            x[i] = Integer.parseInt(arr[0]);
            y[i] = Integer.parseInt(arr[1]);
        }

        int minX = x[0];
        int minY = y[0];
        int maxX = x[0];
        int maxY = y[0];

        for(int i = 0; i < a; i++) {
            if(minX > x[i]) {
                minX = x[i];
            }
            if(maxX < x[i]) {
                maxX = x[i];
            }
        }
        for(int i = 0; i < a; i++) {
            if(minY > y[i]) {
                minY = y[i];
            }
            if(maxY < y[i]) {
                maxY = y[i];
            }
        }
        int sum = (maxX - minX) * (maxY - minY);

        if(a == 1) {
            bw.write("0");
        } else {
            bw.write(sum + "");
        }


        bw.flush();
        bw.close();
    }
}
