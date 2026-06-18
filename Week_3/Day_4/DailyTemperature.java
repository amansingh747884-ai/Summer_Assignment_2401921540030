package Week_3.Day_4;

import java.util.*;
public class DailyTemperature {
    
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int tos = st.pop();
                ans[tos] = i - tos;
            }
            st.push(i);
        }      
        return ans;
    }
}
