import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = (bf.readLine()).split("");

        int num = Integer.parseInt(bf.readLine());

        bw.write(arr[num - 1]);



        bw.flush();
        bw.close();
    }
}
