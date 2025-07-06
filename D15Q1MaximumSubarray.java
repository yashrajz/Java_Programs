// Leetcode questions - 53
public class D15Q1MaximumSubarray {
     public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Kadane’s Algorithm
        for (int i = 1; i < nums.length; i++) {
            if(currentSum + nums[i] > nums[i]){
                currentSum += nums[i];
            }
            else{
                currentSum = nums[i];
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
