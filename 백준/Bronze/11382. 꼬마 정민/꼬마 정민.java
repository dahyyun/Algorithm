import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = bf.readLine().split(" ");

        long a = Long.parseLong(arr[0]);
        long b = Long.parseLong(arr[1]);
        long c = Long.parseLong(arr[2]);

        long result = a + b + c;

        System.out.println(result);
    }
}
