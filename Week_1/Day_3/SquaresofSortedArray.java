package Week_1.Day_3;

import java.util.Arrays;

public class SquaresofSortedArray {
     public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] sq = new int[n];
        
        for (int i = 0; i < n; i++) {
            sq[i] = nums[i] * nums[i];
        }
        
        Arrays.sort(sq);
        return sq;
    }
}

// ------------------- two pointer approach -------------------

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int pos = n - 1;
        
        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];
            
            if (leftSq > rightSq) {
                result[pos--] = leftSq;
                left++;
            } else {
                result[pos--] = rightSq;
                right--;
            }
        }
        
        return result;
    }
}

