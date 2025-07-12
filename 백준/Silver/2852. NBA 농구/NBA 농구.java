import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int score1 = 0;
        int score2 = 0;

        int winTime1 = 0;
        int winTime2 = 0;

        int prevMin = 0;
        int prevSec = 0;

        for(int i = 0; i < n; i++){
            String[] arr = br.readLine().split(" ");

            int team = Integer.parseInt(arr[0]);
            String[] time = arr[1].split(":");

            int curMin = Integer.parseInt(time[0]);
            int curSec = Integer.parseInt(time[1]);

            int elapsed = (curMin * 60 + curSec) - (prevMin * 60 + prevSec);

            if (score1 > score2) {
                winTime1 += elapsed;
            } else if (score2 > score1) {
                winTime2 += elapsed;
            }

            if (team == 1) score1++;
            else score2++;

            prevMin = curMin;
            prevSec = curSec;

        }

        int finalElapsed = (48 * 60) - (prevMin * 60 + prevSec);
        if (score1 > score2) {
            winTime1 += finalElapsed;
        } else if (score2 > score1) {
            winTime2 += finalElapsed;
        }

        bw.write(formatTime(winTime1) + "\n");
        bw.write(formatTime(winTime2) + "\n");

        bw.flush();
        bw.close();
    }

    private static String formatTime(int totalSeconds) {
        int min = totalSeconds / 60;
        int sec = totalSeconds % 60;
        return String.format("%02d:%02d", min, sec);
    }
}
