// Leetcode question - 27
public class D6Q1RemoveElement {
    public int removeElement(int[] nums, int val) {
        int ptr = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        return ptr;
}
