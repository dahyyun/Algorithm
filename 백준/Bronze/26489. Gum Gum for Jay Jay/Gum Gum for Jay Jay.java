import java.io.*;
import java.util.*;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;

        String arr;
        while((arr = bf.readLine()) != null) {
            count += 1;
        }

        bw.write(count + "");

        bw.flush();
        bw.close();
    }
}
