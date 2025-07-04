// Leetcode questions - 33
public class D12Q1SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[start] <= nums[mid]){ // first part is shorted
                if(target >= nums[start] && target < nums[mid]){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }   
            }
            else{                           // second part is shorted
                if(target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }

            }
        }
        return -1;
    }
}
