package Week_3.Day_3;

import java.util.Stack;

class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int value) {
        if (st.size() == 0) {
            st.push(value);
            min.push(value);
        } else {
            st.push(value);
            if (min.peek() < value)
                min.push(min.peek());
            else
                min.push(value);
        }
    }

    public void pop() {
        st.pop();
        min.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
