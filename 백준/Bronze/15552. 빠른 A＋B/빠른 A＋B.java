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


        int[] result = new int[count];

        for(int i = 0; i < count; i++) {
            String inputxy = bf.readLine().trim();
            String[] arr = inputxy.split(" ");

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            result[i] = a + b;
        }

        for(int i = 0; i < count; i++) {
            bw.write(result[i] + "\n");
        }

        bw.flush();
        bw.close();

    }
}
