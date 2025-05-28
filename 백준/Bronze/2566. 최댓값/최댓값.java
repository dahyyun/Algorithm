import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] lines = new String[9];

        for(int i = 0; i < 9; i++) {
            lines[i] = (bf.readLine().trim());
        }

        int[][] num = new int[9][9];

        for(int i = 0; i < 9; i++) {
            String[] nums = lines[i].split(" ");
            for(int j = 0; j < 9; j++) {
                num[i][j] = Integer.parseInt(nums[j]);
            }
        }

        int max = num[0][0];

        int row = 0;
        int col = 0;

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(max < num[i][j]) {
                    max = num[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        bw.write(max + "\n" + (row + 1) + " " + (col + 1));

        bw.flush();
        bw.close();

    }
}
