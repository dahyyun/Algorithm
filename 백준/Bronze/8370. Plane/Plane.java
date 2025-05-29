import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = (bf.readLine().trim()).split(" ");

        int[] seats = new int[4];

        for(int i = 0; i < 4; i++) {
            seats[i] = Integer.parseInt(arr[i]);
        }

        int sum = seats[0] * seats[1] + seats[2] * seats[3];

        bw.write(sum + "");

        bw.flush();
        bw.close();

    }
}
