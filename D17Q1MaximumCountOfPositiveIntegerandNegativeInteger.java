// Leetcode questions - 2529
public class D17Q1MaximumCountOfPositiveIntegerandNegativeInteger {
    public int maximumCount(int[] nums) {
        int negCount = 0;
        int posCount = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                negCount++;
            }
            else if(nums[i] > 0){
                posCount++;
            }
        }

        if(negCount < posCount){
            return posCount;
        }
        else{
            return negCount;
        }
    }
}
