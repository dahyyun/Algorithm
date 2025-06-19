import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isTrue = true;

        while(isTrue) {
            int a = Integer.parseInt(br.readLine());

            if(a == -1) {
                isTrue = false;
                break;
            } else {

                int[] arr = new int[a];

                int j = 1;

                int sum = 0;

                for(int i = 1; i < a; i++) {
                    if(a % i == 0) {
                        arr[j] = i;
                        sum += arr[j];
                        j += 1;
                    }
                }

                if(sum == a) {
                    bw.write(a + " = ");
                    for(int k = 1; k < arr.length; k++) {
                        if(k == 1) {
                            bw.write(arr[k] + "");
                        } else if(arr[k] == 0) {
                            bw.write("\n");
                            break;
                        } else {
                            bw.write(" + " + arr[k]);
                        }
                    }
                } else {
                    bw.write(a + " is NOT perfect.\n");
                }
            }

        }


        bw.flush();
        bw.close();




    }
}
