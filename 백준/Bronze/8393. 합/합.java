import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine().trim();
        int a = Integer.parseInt(input);

        int sum = 0;

        for (int i = 0; i < a + 1; i++) {
            sum += i;
        }

        System.out.println(sum);

    }
}
