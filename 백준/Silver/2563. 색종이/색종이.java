import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[][] page = new boolean[100][100];
        int count = 0;

        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                page[i][j] = false;
            }
        }

        int s = Integer.parseInt(bf.readLine());

        for(int i = 0; i < s; i++) {
            String[] xy = bf.readLine().split(" ");

            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);

            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    if(!page[j][k]) {
                        page[j][k] = true;
                        count += 1;
                    }
                }
            }
        }



        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}
