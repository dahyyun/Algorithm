import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bf.readLine().trim());
        int b = Integer.parseInt(bf.readLine().trim());

        int result = 0;

        if(a >= 20 && a <= 23) {
            result = 24 - a + b;
        } else {
            result = b - a;
        }


        bw.write(result + "");


        bw.flush();
        bw.close();
    }
}
