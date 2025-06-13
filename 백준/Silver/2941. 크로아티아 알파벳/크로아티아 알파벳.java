import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String s = br.readLine().trim();

        for(int i = 0; i < arr.length; i++) {
            if(s.contains(arr[i])) {
                s = s.replace(arr[i], "/");
            }
        }

        int count = s.length();

        bw.write(count + "");
        bw.flush();
        bw.close();

    }
}
