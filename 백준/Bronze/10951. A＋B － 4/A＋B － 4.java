import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while ((str = bf.readLine()) != null) {
            String[] arr = str.split(" ");

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            int result = a + b;

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();

    }
}
