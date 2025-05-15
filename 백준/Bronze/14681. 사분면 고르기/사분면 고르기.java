import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String inputx = bf.readLine().trim();
        int x = Integer.parseInt(inputx);

        String inputy = bf.readLine().trim();
        int y = Integer.parseInt(inputy);

        if(x > 0) {
            if (y > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if (y > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }


    }
}
