import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input1 = bf.readLine().trim();
        String input2 = bf.readLine().trim();

        int a = Integer.parseInt(input2)/100;
        int b = (Integer.parseInt(input2) - a * 100) / 10;
        int c = Integer.parseInt(input2) - (a * 100) - (b * 10);

        int result1 = Integer.parseInt(input1) * c;
        int result2 = Integer.parseInt(input1) * b;
        int result3 = Integer.parseInt(input1) * a;

        int result4 = result3 * 100 + result2 * 10 + result1;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);





    }
}
