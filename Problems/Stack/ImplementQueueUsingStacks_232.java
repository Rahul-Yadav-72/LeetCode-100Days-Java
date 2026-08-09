package Problems.Stack;
import java.util.Stack;

public class ImplementQueueUsingStacks_232 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public static void main(String[] args) {
        ImplementQueueUsingStacks_232 queue = new ImplementQueueUsingStacks_232();
        queue.push(1);
        queue.push(2);  
        queue.push(3);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
        
    }
    public ImplementQueueUsingStacks_232() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void push(int x) {
        while (stack1.size()>0) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (stack2.size()>0) {
            stack1.push(stack2.pop());
        }
    }
    public int pop() {
        return stack1.pop();
    }
    public int peek() {
        return stack1.peek();
    }
    public boolean empty() {
        if(stack1.isEmpty()) {
            return true;
        }
        return false;
    }
}
