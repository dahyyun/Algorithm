import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] lines = new String[5];
        
        int maxLength = 0;

        for(int i = 0; i < 5; i++) {
            lines[i] = bf.readLine().trim();
            maxLength = Math.max(maxLength, lines[i].length());
        }

        for(int i = 0; i < maxLength; i++) {
            for(int j = 0; j < 5; j++) {
                if(i < lines[j].length()) {
                    bw.write(lines[j].charAt(i));
                }
            }
        }

        bw.flush();
        bw.close();

    }
}
