import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // peek (맨 위 값 확인)
        System.out.println("Top : " + stack.peek()); // 30

        // pop (맨 위 값 제거 및 리턴)
        System.out.println("Pop : " + stack.pop()); // 30
        System.out.println("Pop : " + stack.pop()); // 20

        // isEmpty
        System.out.println("Is empty ? " + stack.isEmpty()); // false
    }
}
