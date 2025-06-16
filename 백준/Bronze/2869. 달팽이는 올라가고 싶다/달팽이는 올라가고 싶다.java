import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int a = Integer.parseInt(arr[0]); // 낮에 올라가는 거리
        int b = Integer.parseInt(arr[1]); // 밤에 미끄러지는 거리
        int v = Integer.parseInt(arr[2]); // 목표 높이

        int days = (int) Math.ceil((double)(v - b) / (a - b));

        System.out.println(days);
    }
}
