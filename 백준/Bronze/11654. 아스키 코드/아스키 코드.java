import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String c = bf.readLine();
        char b = c.charAt(0);

        int a = (int) b;

        bw.write(a + "");


        bw.flush();
        bw.close();
    }
}
