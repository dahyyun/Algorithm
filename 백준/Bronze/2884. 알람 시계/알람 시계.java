import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine().trim();
        String[] arr = input.split(" ");

        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        if (m - 45 < 0) {
            h -= 1;
            m += 15;
            if (h < 0) {
                h += 24;
            }
        } else {
            m -= 45;
        }

        System.out.println(h + " " + m);
    }
}
