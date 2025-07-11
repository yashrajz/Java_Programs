// Leetcode questions - 128

import java.util.Arrays;

public class D20Q2LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int longest = 1;
        int current = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue; // skipping duplicates
            } else if (nums[i] == nums[i - 1] + 1) {
                current++; // finding next number in sequence
            } else {
                longest = Math.max(longest, current);
                current = 1; // reseting count
            }
        }

        return Math.max(longest, current);
    }
}
