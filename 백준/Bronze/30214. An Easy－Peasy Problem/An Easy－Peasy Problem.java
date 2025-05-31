import java.io.*;
import java.util.*;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] arr = (bf.readLine().trim()).split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        double c = (double)b / 2;
        double d = round(c);


        if( a >= d ) {
            bw.write("E");
        } else {
            bw.write("H");
        }

        bw.flush();
        bw.close();
    }
}
