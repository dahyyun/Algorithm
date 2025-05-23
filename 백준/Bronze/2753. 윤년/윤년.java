import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine().trim();

        int year = Integer.parseInt(input);

        if(year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("1");
            } else if (year % 400 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
    }
}
