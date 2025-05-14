
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine().trim();
        String[] Arr = input.split(" ");

        int A = Integer.parseInt(Arr[0]);
        int B = Integer.parseInt(Arr[1]);
        int C = Integer.parseInt(Arr[2]);

        int result1 = (A + B) % C;
        int result2 = (result1) % C;
        int result3 = (A * B) % C;
        int result4 = (result3) % C;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
