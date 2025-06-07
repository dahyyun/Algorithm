import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0; i < n; i++) {
            for(int k = (n - 1) - i; k > 0; k--) {
                bw.write(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        for(int a = 0; a < (n - 1); a++) {
            for(int b = 0; b < a + 1; b++) {
                bw.write(" ");
            }
            for(int c = 2 * n - 3 - 2 * a; c > 0; c--) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
