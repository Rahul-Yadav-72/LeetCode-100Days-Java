package Problems.Stack;

import java.util.Stack;

public class MinStack_155 {
    public static void main(String[] args) {
        MinStack_155 minStack = new MinStack_155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
    
    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack_155() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int value) {
        if(st.size() == 0 || min.peek() >= value){
            min.push(value);
        }
        st.push(value);
    }
    
    public void pop() {
        int ele1 = st.pop();
        int ele2 = min.peek();
        if(ele1 == ele2){
            min.pop();
        }
    }
    
    public int top() {
       return st.peek();
    }
    
    public int getMin() {
       return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

