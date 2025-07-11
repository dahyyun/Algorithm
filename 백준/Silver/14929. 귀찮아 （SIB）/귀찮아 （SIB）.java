import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        int[] inums = new int[a];
        long sum = 0;
        long total = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < a; i++) {
            inums[i] = Integer.parseInt(st.nextToken());
            total += inums[i];
        }

        for(int j = 0; j < inums.length; j++) {
            total -= inums[j];
            sum += (long) inums[j] * total;
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
    }
}
