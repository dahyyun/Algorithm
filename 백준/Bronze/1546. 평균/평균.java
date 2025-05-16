import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int s = Integer.parseInt(bf.readLine());

        String[] str = (bf.readLine()).split(" ");

        int max = Integer.parseInt(str[0]);

        double[] arr = new double[s];

        for(int i = 0; i < s; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        for(int i = 0; i < s; i++) {
            if(max < arr[i]) {
                max = (int) arr[i];
            }
        }

        double sum = 0.0;

        for(int j = 0; j < s; j++) {
                arr[j] = (float)(arr[j] / max ) * 100;
                sum += (float)arr[j];
        }

        bw.write((float)(sum / s) + " ");


        bw.flush();
        bw.close();

    }
}
