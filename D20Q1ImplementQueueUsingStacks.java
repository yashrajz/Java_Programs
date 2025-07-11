// Leetcode questions - 232

import java.util.Stack;

public class D20Q1ImplementQueueUsingStacks {
    private Stack<Integer> main;
    private Stack<Integer> helper;
    

    public D20Q1ImplementQueueUsingStacks() {   //constructor
        main = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        
        //Adding element to helper from main
        while(main.size() > 0){
            helper.push(main.pop());
        }
        
        //adding x element to main
        main.push(x);

        //adding element to main from helper again
        while(helper.size() > 0){
            main.push(helper.pop());
        }
        
    }
    
    public int pop() {
        return main.pop();
    }
    
    public int peek() {
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
