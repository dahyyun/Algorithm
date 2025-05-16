import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String inputs = bf.readLine().trim();
        int sum = Integer.parseInt(inputs);

        String inputc = bf.readLine().trim();
        int count = Integer.parseInt(inputc);

        int[] price = new int[count];
        int[] cnt = new int[count];

        for(int i = 0; i < count; i++) {
            String input = bf.readLine().trim();
            String[] arr = input.split(" ");

            price[i] = Integer.parseInt(arr[0]);
            cnt[i] = Integer.parseInt(arr[1]);
        }

        int total = 0;

        for (int i = 0; i < count; i++) {
            total += price[i] * cnt[i];
        }

        if (total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
