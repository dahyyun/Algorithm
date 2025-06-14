import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        int[] q = new int[a];
        int[] d = new int[a];
        int[] n = new int[a];
        int[] p = new int[a];

        for(int i = 0; i < a; i++) {
            int sum = Integer.parseInt(br.readLine());

            q[i] = sum / 25; // 124 / 25 = 4
            d[i] = (sum - (q[i] * 25)) / 10; // (124 - 100) / 10 = 2
            n[i] = (sum - (q[i] * 25) - (d[i] * 10)) / 5; // (124 - 100 - 20) / 5 = 0
            p[i] = sum - (q[i] * 25) - (d[i] * 10) - (n[i] * 5);
        }

        for(int j = 0; j < a; j++) {
            bw.write(q[j] + " " + d[j] + " " + n[j] + " " + p[j] + "\n");
        }


        bw.flush();
        bw.close();
    }
}
