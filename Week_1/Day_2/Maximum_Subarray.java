package Week_1.Day_2;
public class Maximum_Subarray {
     public int maxSubArray(int[] nums) {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int x:nums){
            currsum+=x;
            maxsum=Math.max(currsum,maxsum);
            if(currsum<0) currsum=0;
        }
        return maxsum;
    }
}