import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // offer (enqueue)
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // peek (맨 앞 값 확인)
        System.out.println("Front : " + queue.peek()); // 10

        // poll (맨 앞 값 제거 및 리턴)
        System.out.println("Poll : " + queue.poll()); // 10
        System.out.println("Poll : " + queue.poll()); // 20

        // isEmpty
        System.out.println("Is empty ? " + queue.isEmpty()); // false
    }
}
