import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> set = new HashSet<>();

        int[] a = new int[10];

        for(int i = 0; i < 10; i++) {
            String input = bf.readLine().trim();
            a[i] = Integer.parseInt(input);
            set.add(a[i] % 42);
        }

        bw.write(set.size() + " ");


        bw.flush();
        bw.close();



    }
}
