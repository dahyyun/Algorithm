import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr =  br.readLine().split(" ");

        int n =  Integer.parseInt(arr[0]);
        int m =  Integer.parseInt(arr[1]);

        int[] numbers = new int[n + 1];
        int[] prefixSum = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
            prefixSum[i] = prefixSum[i - 1] + numbers[i];
        }

        for (int s = 0; s < m; s++) {
            StringTokenizer query = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(query.nextToken());
            int j = Integer.parseInt(query.nextToken());

            int result = prefixSum[j] - prefixSum[i - 1];
            bw.write(result + "\n");
        }


        bw.flush();
        bw.close();
    }
}
