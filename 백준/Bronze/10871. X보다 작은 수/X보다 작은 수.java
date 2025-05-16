import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = (bf.readLine()).split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        int count = 0;

        String[] arr = (bf.readLine()).split(" ");

        int[] ar = new int[a];

        for(int i = 0; i < a; i++) {
            ar[i] = Integer.parseInt(arr[i]);

            if(ar[i] < b) {
                count++;
                bw.write(ar[i]+ " ");
            }
        }


        bw.flush();
        bw.close();

    }
}
