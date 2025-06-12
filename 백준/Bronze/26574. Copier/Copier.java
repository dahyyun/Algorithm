import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        int[] num = new int[a];

        for(int i = 0; i < a; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        for(int j = 0; j < a; j++) {
            bw.write(num[j] + " " + num[j] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
