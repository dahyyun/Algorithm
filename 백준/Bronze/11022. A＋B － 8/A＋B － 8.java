import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = bf.readLine().trim();
        int count = Integer.parseInt(input);

        int[] a = new int[count];
        int[] b = new int[count];
        int[] result = new int[count];

        for(int i = 0; i < count; i++) {
            String inputxy = bf.readLine().trim();
            String[] arr = inputxy.split(" ");

            a[i] = Integer.parseInt(arr[0]);
            b[i] = Integer.parseInt(arr[1]);

            result[i] = a[i] + b[i];
        }

        for(int i = 0; i < count; i++) {
            bw.write("Case #" + (i + 1) + ": " + a[i] + " + " + b[i] + " = " + result[i] + "\n");
        }

        bw.flush();
        bw.close();

    }
}
