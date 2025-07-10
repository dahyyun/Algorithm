import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < a; i++) {
            String word = br.readLine();
            if(word.length() >= b) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(map.keySet());

        words.sort((w1, w2) -> {
            int count1 = map.get(w1);
            int count2 = map.get(w2);

            if (count1 != count2) {
                return Integer.compare(count2, count1);
            }

            if (w1.length() != w2.length()) {
                return Integer.compare(w2.length(), w1.length());
            }

            return w1.compareTo(w2);
        });

        for (String word : words) {
            bw.write(word + "\n");
        }

        bw.flush();
        bw.close();
    }
}
