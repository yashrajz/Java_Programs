// Leetcode questions - 155

import java.util.Stack;

public class D19Q2MinStack {
    Stack<Integer> stack;     
    Stack<Integer> minStack; 

    public D19Q2MinStack() {       //constructor
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int removed = stack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek(); 
    }

    public int getMin() {
        return minStack.peek(); 
    }
}
