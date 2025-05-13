import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine().trim();
        String[] parts = input.split(" ");

        int sum = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);

        System.out.println(sum);
    }
}
