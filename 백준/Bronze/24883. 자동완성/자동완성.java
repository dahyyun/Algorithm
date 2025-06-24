import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char c = br.readLine().charAt(0); // 첫 문자만 읽음

        if (c == 'n' || c == 'N') {
            System.out.println("Naver D2");
        } else {
            System.out.println("Naver Whale");
        }
    }
}
