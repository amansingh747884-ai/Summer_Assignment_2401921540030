package Week_3.Day_3;
import java.util.*;
public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        
        for (int i = nums2.length - 1; i >= 0; i--) {
            int element = nums2[i];
            while (!st.isEmpty() && st.peek() <= element) {
                st.pop();
            }
            map.put(element, st.isEmpty() ? -1 : st.peek());
            st.push(element);
        }
        
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}
