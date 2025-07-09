import java.util.Arrays;

Leetcode questions - 215
public class D18Q1KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
}
