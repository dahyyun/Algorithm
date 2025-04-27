package Practice;

public class Network {

    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        int count = 0;
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(n, computers, visited, i);
                count++;
            }
        }

        System.out.println("네트워크의 개수 : " + count);
    }

    public static void dfs(int n, int[][] computers, boolean[] visited, int cur) {
        visited[cur] = true;

        for(int i = 0; i < n; i++) {
            if(!visited[i] && computers[cur][i] == 1) {
                dfs(n, computers, visited, i);
            }
        }

    }

}