import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i = 0; i < a; i++) {
            boolean[] sen = new boolean[26];
            boolean isGroupWord = true;

            char c = 0;
            String arr = br.readLine();

            for(int j = 0; j < arr.length(); j++) {
                char s = arr.charAt(j);

                if(s != c) {
                    if(!(sen[s - 'a'])) {
                        sen[s - 'a'] = true;
                    } else  {
                        isGroupWord = false;
                        break;
                    }
                }
                c = s;
            }

            if(isGroupWord) {
                count += 1;
            }

        }

        bw.write(count + "");

        bw.flush();
        bw.close();

    }
}
