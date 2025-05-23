import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt((bf.readLine().trim()));
        int b = Integer.parseInt((bf.readLine().trim()));
        int c = Integer.parseInt((bf.readLine().trim()));

        int sum = a + b + c;

        if(sum == 180) {
            if(a == b && b == c) {
                bw.write("Equilateral");
            } else if (a == b || b == c || c == a) {
                bw.write("Isosceles");
            } else {
                bw.write("Scalene");
            }
        } else {
            bw.write("Error");
        }
        
        bw.flush();
        bw.close();
    }
}
