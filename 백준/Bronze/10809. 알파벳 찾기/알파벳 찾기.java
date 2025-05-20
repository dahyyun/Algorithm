import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = bf.readLine();
        int[] alphabet = new int[26];

        for(int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }

        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            int idx = ch - 'a';

            if(alphabet[idx] == -1) {
                alphabet[idx] = i;
            }
        }

        for(int i = 0; i < 26; i++) {
            bw.write(alphabet[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
