import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = (bf.readLine()).split(" ");

        String[] s1 = (arr[0]).split("");
        String[] s2 = (arr[1]).split("");

        String[] a1 = new String[3];
        String[] a2 = new String[3];

        for(int i = 0; i < 3; i++) {
            a1[i] = s1[2 - i];
            a2[i] = s2[2 - i];
        }

        String str1 = a1[0] + a1[1] + a1[2];
        String str2 = a2[0] + a2[1] + a2[2];

        int r1 = Integer.parseInt(str1);
        int r2 = Integer.parseInt(str2);

        if(r1 > r2) {
            bw.write(r1 + "");
        } else {
            bw.write(r2 + "");
        }


        bw.flush();
        bw.close();
    }
}
