import java.util.*;

public class DFS {
    // visited를 set으로 구현
    public void dfs(List<List<Integer>> graph, Set<Integer> visited, int curVertex) {
        // ===== 코드 구현 =====
        visited.add(curVertex);
        for (int next : graph.get(curVertex)) {
            dfs(graph, visited, next);
        }

        // ===================
    }

    // visited를 array로 구현
    public void dfs(List<List<Integer>> graph, boolean[] visited, int curVertex) {
        // ===== 코드 구현 =====

        // ===================
    }

    public void solve(List<List<Integer>> graph) {
        Set<Integer> visited = new HashSet<>();
        dfs(graph, new HashSet<>(), 0);
        dfs(graph, new boolean[graph.size()], 0);
    }

    // 실행용 메소드
    public static void main(String[] args) {
        (new DFS()).solve(makeGraph());
    }

    public static List<List<Integer>> makeGraph() {
        return new ArrayList<>() {{
            add(List.of(1, 3, 6));
            add(List.of(0, 3));
            add(List.of(3));
            add(List.of(0, 1, 2, 7));
            add(List.of(5));
            add(List.of(4, 6, 7));
            add(List.of(0, 5));
            add(List.of(3, 5));
        }};
    }
}
