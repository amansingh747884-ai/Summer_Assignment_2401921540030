package Week_1.Day_3;

public class ContainerWithMostWater {
     public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxarea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currarea = minHeight * width;
            maxarea = Math.max(maxarea, currarea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxarea;
    }
}
