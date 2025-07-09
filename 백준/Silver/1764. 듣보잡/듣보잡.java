import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        Set<String> aname = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            aname.add(br.readLine());
        }

        for (int j = 0; j < b; j++) {
            String name = br.readLine();
            if (aname.contains(name)) {
                result.add(name);
            }
        }

        Collections.sort(result);

        bw.write(result.size() + "\n");
        for (String name : result) {
            bw.write(name + "\n");
        }

        bw.flush();
        bw.close();
    }
}
