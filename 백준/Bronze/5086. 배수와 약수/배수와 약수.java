import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Boolean isEnd = true;

        while (isEnd) {
            String[] arr = br.readLine().split(" ");

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            if(a == 0 && b == 0) {
                isEnd = false;
            } else if(b > a && b % a == 0) {
                bw.write("factor");
                bw.write("\n");
            } else if(a > b && a % b == 0) {
                bw.write("multiple");
                bw.write("\n");
            } else {
                bw.write("neither");
                bw.write("\n");
            }
        }

        bw.flush();
        bw.close();




    }
}
