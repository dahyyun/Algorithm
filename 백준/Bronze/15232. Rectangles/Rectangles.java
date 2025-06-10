import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();

    }
}
