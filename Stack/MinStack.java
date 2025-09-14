import java.util.ArrayDeque;
import java.util.Stack;

public class MinStack {

    private ArrayDeque<Integer> stack;
    private ArrayDeque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
    public static void main(String[] args) {
        MinStack minstack = new MinStack();
        minstack.push(15);
        minstack.push(13);
        minstack.push(10);
        System.out.println(minstack.top());
        System.out.println(minstack.getMin());
        minstack.pop();
        System.out.println(minstack.getMin());
    }
}
