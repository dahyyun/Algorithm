import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        int j = 1;

        int[] lt = new int[n];

        for(int i = 1; i < n + 1; i++) {
            int a = n % i;

            if(a == 0) {
                lt[j] = i;
                j += 1;
            }
        }

        bw.write(lt[k] + "");

        bw.flush();
        bw.close();




    }
}
