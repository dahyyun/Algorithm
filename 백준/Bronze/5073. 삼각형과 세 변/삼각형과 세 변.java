import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] arr = (bf.readLine().trim()).split(" ");

            if(Integer.parseInt(arr[0]) == 0 && Integer.parseInt(arr[1]) == 0 && Integer.parseInt(arr[2]) == 0) {
                break;
            }

            int max = Integer.parseInt(arr[0]);

            for(int i = 0; i < arr.length; i++) {
                if(Integer.parseInt(arr[i]) > max) {
                    max = Integer.parseInt(arr[i]);
                }
            }

            int a = 0;
            int b = 0;

            if(max == Integer.parseInt(arr[0])) {
                a = Integer.parseInt(arr[1]);
                b = Integer.parseInt(arr[2]);
            } else if (max == Integer.parseInt(arr[1])) {
                a = Integer.parseInt(arr[0]);
                b = Integer.parseInt(arr[2]);
            } else {
                a = Integer.parseInt(arr[0]);
                b = Integer.parseInt(arr[1]);
            }

            if(max >= a + b) {
                bw.write("Invalid" + "\n");
            } else if (max == a && a == b){
                bw.write("Equilateral" + "\n");
            } else if (max == a || a == b || b == max) {
                bw.write("Isosceles" + "\n");
            } else {
                bw.write("Scalene" + "\n");
            }
        }
        bw.flush();
        bw.close();

    }
}
