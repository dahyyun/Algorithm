import java.io.*;
import java.math.BigInteger;
import java.util.function.LongToIntFunction;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());


            for(int i = 2; i < a + 1; i++) {
                while(a % i == 0) {
                    bw.write(i + "\n");
                    a = a / i;
                }
            }


        bw.flush();
        bw.close();
    }
}
