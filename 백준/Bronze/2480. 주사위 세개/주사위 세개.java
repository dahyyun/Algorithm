import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine().trim();
        String[] arr = input.split(" ");

        int x1 = Integer.parseInt(arr[0]);
        int x2 = Integer.parseInt(arr[1]);
        int x3 = Integer.parseInt(arr[2]);

        if (x1 == x2) {
            if (x2 == x3) {
                int result = 10000 + x1 * 1000;
                System.out.println(result);
            } else {
                int result = 1000 + x1 * 100;
                System.out.println(result);
            }
        } else if (x2 == x3) {
            if (x1 == x3) {
                int result = 10000 + x1 * 100;
                System.out.println(result);
            } else {
                int result = 1000 + x2 * 100;
                System.out.println(result);
            }
        } else if (x3 == x1) {
            if (x2 == x3) {
                int result = 10000 + x1 * 100;
                System.out.println(result);
            } else {
                int result = 1000 + x3 * 100;
                System.out.println(result);
            }
        } else {
            if (x1 > x2) {
                if(x1 > x3) {
                    System.out.println(x1 * 100);
                } else {
                    System.out.println(x3 * 100);
                }
            } else if (x2 > x3) {
                if (x1 > x2) {
                    System.out.println(x1 * 100);
                } else {
                    System.out.println(x2 * 100);
                }
            } else {
                if (x3 > x2) {
                    System.out.println(x3 * 100);
                } else {
                    System.out.println(x2 * 100);
                }
            }
        }
    }
}
