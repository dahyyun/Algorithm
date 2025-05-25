import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = (bf.readLine().trim()).split(" ");

        int[] tr = new int[3];

        tr[0] = Integer.parseInt(arr[0]);
        tr[1] = Integer.parseInt(arr[1]);
        tr[2] = Integer.parseInt(arr[2]);

        int max = tr[0];

        for(int i = 0; i < 3; i++) {
            if(max < tr[i]) {
                max = tr[i];
            }

        }

        int a = 0;
        int b = 0;

        if(max == tr[0]) {
            a = tr[1];
            b = tr[2];
        } else if (max == tr[1]) {
            a = tr[0];
            b = tr[2];
        } else {
            a = tr[0];
            b = tr[1];
        }

        if(max >= a + b) {
            max = a + b - 1;
        }

        int sum = max + a + b;

        bw.write(sum + "");

        bw.flush();
        bw.close();
    }
}
