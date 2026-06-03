package Week_1.Day_3;

public class Move_zeros {
    public void moveZeroes(int[] nums) {
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = temp;
                pos++;
            }
        }
    }
}
