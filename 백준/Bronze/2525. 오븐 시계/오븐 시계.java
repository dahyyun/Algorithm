import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine().trim();
        String[] arr = input.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        String time = bf.readLine().trim();
        int m = Integer.parseInt(time);

        if (b + m >= 60) {
            a += (b + m) / 60;
            if (a >= 24) {
                a -= 24;
            }
            b = (b + m) % 60;
        } else {
            b = b + m;
        }

        System.out.println(a + " " + b);

    }
}
