// Leetcode questions - 225

import java.util.LinkedList;
import java.util.Queue;

public class D19Q1ImplementStackUsingQueues {
    private Queue<Integer> main;
    private Queue<Integer> helper;

    public D19Q1ImplementStackUsingQueues() {   //constructor
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }
    
    public void push(int x) {
        //moving all elements to helper by removing from main
        while(main.size() > 0){
            helper.add(main.remove());
        }
        
        //add x to main queue
        main.add(x);

        //moving all to main by removing from helper
        while(helper.size() > 0){
            main.add(helper.remove());
        }
    }
    
    public int pop() {
        return main.remove();
    }
    
    public int top() {
        return main.peek();
    }
    
    public boolean empty() {
        if(main.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */