import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine().trim();
        String[] parts = input.split(" ");


        int result1 = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
        int result2 = Integer.parseInt(parts[0]) - Integer.parseInt(parts[1]);
        int result3 = Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]);
        int result4 = Integer.parseInt(parts[0]) / Integer.parseInt(parts[1]);
        int result5 = Integer.parseInt(parts[0]) % Integer.parseInt(parts[1]);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }
}
