import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = (bf.readLine().trim()).split(" ");

        int[] wpiece = new int[]{1, 1, 2, 2, 2, 8};

        int[] bpiece = new int[6];

        for(int i = 0; i < 6; i++) {
            bpiece[i] = wpiece[i] - Integer.parseInt(arr[i]);
            bw.write(bpiece[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
