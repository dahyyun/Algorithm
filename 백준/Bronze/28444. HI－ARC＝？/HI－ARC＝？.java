import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = bf.readLine().split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int d = Integer.parseInt(arr[3]);
        int e = Integer.parseInt(arr[4]);

        int result = (a * b) - (c * d * e);

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
