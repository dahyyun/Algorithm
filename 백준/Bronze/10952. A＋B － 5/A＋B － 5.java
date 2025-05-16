import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean P = true;

        while (P) {
            String str = bf.readLine().trim();
            String[] arr = str.split(" ");

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            if(a == 0 && b == 0) {
                break;
            }

            int result = a + b;

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();

    }
}
