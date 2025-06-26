//Leetcode question - 268
public class D5Q2MissingNumber {
        public int missingNumber(int[] nums) {      // clever math trick
        int n = nums.length;                        // use actualsum - current sum to find the missing no.

        int actualSum = (n * (n + 1)) / 2;
        
        int currentSum = 0;
        for(int i = 0; i < n; i++){
            currentSum += nums[i];
        }

        return actualSum - currentSum;
}
