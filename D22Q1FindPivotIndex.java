// Leetcode questions - 724
public class D22Q1FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int rsum = 0;

        for(int ele : nums){
            rsum += ele;
        }

        int lsum = 0;
        for(int i = 0; i < nums.length; i++){
            rsum -= nums[i];

            if(lsum == rsum){
                return i;
            }

            lsum += nums[i];
        }
        return -1;
    }
}
