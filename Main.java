import stack.SimpleStack;

public class Main {
    public static void main(String[] args) {
        SimpleStack<Integer> stack = new SimpleStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}