import java.io.*;
import java.math.BigInteger;
import java.util.function.LongToIntFunction;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;

        for(int i = 0; i < 5; i++) {
            int a =  Integer.parseInt(br.readLine());
            if(a >= 0 && a <= 100){
                count += a;
            }
        }


        bw.write(count + "");

        bw.flush();
        bw.close();
    }
}
