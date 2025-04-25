package Practice;

public class Network {

    public int solution(int n, int[][] computers) {

        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (visited == false) {
                    DFS(i); // BFS(i)
                answer++;
            }
        }

        return answer;
    }
}