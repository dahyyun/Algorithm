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

        for(int i = 0; i < count; i++) {
            for(int j = count - i - 1; j > 0; j--) {
                bw.write(" ");
            }
            for(int  j = 0; j <= i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();

    }
}
