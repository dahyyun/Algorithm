import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = bf.readLine().toUpperCase();
        int[] count = new int[26];

        for(int i = 0; i < input.length(); i++) {
            count[input.charAt(i) - 'A']++;
        }

        int max = -1;
        char result = '?';

        for(int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char)(i + 'A');
            } else if (count[i] == max) {
                result = '?';
            }
        }

        bw.write(result + "");
        bw.flush();
        bw.close();

    }
}
