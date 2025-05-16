import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine().trim();
        int a = Integer.parseInt(input);

        int[] result = new int[a];

        for(int i = 0; i < a; i++) {
            String str = bf.readLine().trim();
            String[] arr = str.split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            result[i] = x + y;
        }

        for(int i = 0; i < a; i++) {
            System.out.println(result[i]);
        }

    }
}
