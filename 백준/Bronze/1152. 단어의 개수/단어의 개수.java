import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String arr = bf.readLine().trim();

        if(arr.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = arr.split("\\s+");
            System.out.println(words.length);
        }


        bw.flush();
        bw.close();

    }
}
