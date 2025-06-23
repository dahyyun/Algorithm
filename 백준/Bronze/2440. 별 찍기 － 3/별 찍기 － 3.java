import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i < a; i++) {
            for(int j = a - i; j > 0; j--) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();




    }
}
