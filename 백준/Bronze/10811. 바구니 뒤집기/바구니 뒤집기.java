import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = bf.readLine().trim();
        String[] arr = input.split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        int[] pocket = new int[a];

        for (int i = 0; i < a; i++) {
            pocket[i] = (i + 1);
        }

        for (int k = 0; k < b; k++) {
            String in = bf.readLine().trim();
            String[] step = in.split(" ");

            int start = Integer.parseInt(step[0]) - 1;
            int end = Integer.parseInt(step[1]) - 1;


            while (start < end) {
                int temp = pocket[start];
                pocket[start] = pocket[end];
                pocket[end] = temp;
                start++;
                end--;
            }
        }

            for (int i = 0; i < a; i++) {
                bw.write(pocket[i] + " ");
            }

            bw.flush();
            bw.close();



    }
}
