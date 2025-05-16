import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine().trim();
        int a = Integer.parseInt(input);

        for(int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d", a, i, a * i);
            System.out.println();
        }

    }
}
