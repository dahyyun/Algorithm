// BFS (Queue)

package Practice;

import java.util.*;

public class KeysAndRooms {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        int n = 4;
        int[][] rooms = {
                {1, 3},
                {3, 0, 1},
                {2},
                {0}
        };

        boolean[] visited = new boolean[n]; // 방문 여부
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(0); // 0번 방부터 시작
        visited[0] = true; // 0번 방 방문

        // BFS 탐색
        while(!queue.isEmpty()) { // queue가 비어있지 않을 때
            int cur = queue.poll(); // 현재 방 번호

            for(int key : rooms[cur]) { // rooms[0][] = {1, 3}
                if(!visited[key]) {
                    visited[key] = true;
                    queue.offer(key);
                }
            }
        }

        boolean allVisited = true;
        for(boolean v : visited) {
            if(!v) { // 하나라도 방문 안 한 방 있으면 false
                allVisited = false;
                break;
            }
        }

        System.out.println(allVisited);
    }
}
