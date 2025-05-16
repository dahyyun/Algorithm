import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine().trim();
        int a = Integer.parseInt(input);

        int b = a / 4;

        if(b > 1) {
            for(int i = 0; i < b; i ++) {
                System.out.print("long ");
            }
            System.out.println("int");
        } else {
            System.out.println("long int");
        }

    }
}
