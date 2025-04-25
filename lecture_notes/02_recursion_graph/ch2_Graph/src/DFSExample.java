import java.util.ArrayList;

public class DFSExample {
    static boolean[] visited; // 노드들이 방문했는지 확인하는 배열 (visited[2] = true)
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 그래프를 표현할 2차원 리스트 (graph.get(1) = [2, 3])

    // 이 함수는 node번 노드부터 연결된 노드들을 깊게 탐색한다.
    public static void dfs(int node) {
        visited[node] = true; // 현재 노드 방문 표시
        System.out.println(node + " ");

        // 현재 노드에 연결된 노드들 하나씩 확인
        for(int next : graph.get(node)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void main(String[] args) {
        int n = 6; // 노드 개수
        visited = new boolean[n + 1]; // 인덱스는 1 ~ 6 사용

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 추가 (양방향 그래프 예시)
        graph.get(1).add(2); graph.get(2).add(1); // 1번과 2번 노드는 서로 연결됨.
        graph.get(1).add(3); graph.get(3).add(1);
        graph.get(2).add(4); graph.get(4).add(2);
        graph.get(3).add(5); graph.get(5).add(3);
        graph.get(5).add(6); graph.get(6).add(5);

        dfs(1); // 1번 노드부터 탐색 시작
    }
}
