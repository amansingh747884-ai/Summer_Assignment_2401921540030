package Week_3.Day_5;

import java.util.Stack;

public class ImplementQueueusingStacks {

    Stack<Integer> st1;
    Stack<Integer> st2;
    public ImplementQueueusingStacks() {
        st1=new Stack<>();
        st2=new Stack<>();
    }
    
    public void push(int x) {
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
        st2.push(x);
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
    }
    
    public int pop() {
       return st2.pop();
    }
    
    public int peek() {
       return st2.peek();
    }
    
    public boolean empty() {
        return st2.isEmpty();
    }
}
