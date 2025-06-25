import java.util.*;

public class D4Q1MaximumProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length - 1;
        int max = nums[n];
        int smax = nums[n - 1];

        return (max - 1) * (smax - 1);
    }    
}
