// Leetcode question - 334
public class D9Q2IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= first) {
                first = nums[i]; // smallest so far
            } else if (nums[i] <= second) {
                second = nums[i]; // second smallest so far
            } else {
                // Found a number greater than both first and second
                return true;
            }
        }

        return false;
}
