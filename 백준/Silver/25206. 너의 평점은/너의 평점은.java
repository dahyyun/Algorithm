import java.io.*;
import java.util.*;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a = new int[20];

        double count = 0;
        double grade = 0;
        double sum = 0;

        for(int i = 0; i < 20; i++) {
            String[] arr = bf.readLine().split(" ");

            switch (arr[2]) {
                case "A+" :
                    grade = 4.5;
                    break;
                case "A0" :
                    grade = 4.0;
                    break;
                case "B+" :
                    grade = 3.5;
                    break;
                case "B0" :
                    grade = 3.0;
                    break;
                case "C+" :
                    grade = 2.5;
                    break;
                case "C0" :
                    grade = 2.0;
                    break;
                case "D+" :
                    grade = 1.5;
                    break;
                case "D0" :
                    grade = 1.0;
                    break;
                case "F" :
                    grade = 0;
                    break;
            }

            if(!(arr[2].equals("P"))) {
                sum += Double.parseDouble(arr[1]) * grade;
                count += Double.parseDouble(arr[1]);
            }

        }

        double result = sum / count;

        bw.write(result + "");

        bw.flush();
        bw.close();
    }
}
