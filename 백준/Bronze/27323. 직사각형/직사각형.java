import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());

        bw.write(a * b + "");

        bw.flush();
        bw.close();
    }
}
