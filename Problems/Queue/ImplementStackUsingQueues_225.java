package Problems.Queue;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues_225 {
    private Queue<Integer> mainQueue;
    private Queue<Integer> tempQueue;
    public static void main(String[] args) {
        ImplementStackUsingQueues_225 stack = new ImplementStackUsingQueues_225();  
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();  
        
        System.out.println(stack.top());
        System.out.println(stack.pop());    
        System.out.println(stack.empty());
    
    }
    public ImplementStackUsingQueues_225() {
        mainQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }
    public void push(int x) {
        while (mainQueue.size()>0) {
            tempQueue.add(mainQueue.remove());
        }
        mainQueue.add(x);
        while (tempQueue.size()>0) {
            mainQueue.add(tempQueue.remove());
        }
    }
    public int pop() {
        return mainQueue.remove();
    }
    public int top() {
        return mainQueue.peek();
    }
    public boolean empty() {
        return mainQueue.isEmpty();
    }
    public void print() {
        System.out.println(mainQueue);
    }
    
}
