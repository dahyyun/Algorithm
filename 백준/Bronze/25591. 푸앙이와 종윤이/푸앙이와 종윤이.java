import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int i = Integer.parseInt(arr[0]);
        int j = Integer.parseInt(arr[1]);

        int a = 100 - i;
        int b = 100 - j;
        int c = i + j - 100;
        int d = a * b;

        int q = d / 100;
        int r = d % 100;

        int result1 = c + q;
        int result2 = r;


        bw.write(a + " " + b + " " + c + " " + d + " " + q + " " + r + "\n");
        bw.write(result1 + " " + result2);
        bw.flush();
        bw.close();




    }
}
