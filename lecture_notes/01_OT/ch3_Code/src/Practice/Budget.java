package Practice;

import java.util.*;

public class Budget {
    public static void main(String[] args) {
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;

        int result = solution(d, budget);
        System.out.println(result);
    }

    public static int solution(int[] d, int budget) {
        int count = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) {
                break;
            } else {
                count++;
            }
        }

        return count;
    }
}
