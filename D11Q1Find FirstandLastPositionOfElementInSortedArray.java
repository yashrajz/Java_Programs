// Leetcode questions - 34
public class D11Q1Find FirstandLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1, -1};

        if(nums.length == 0){
            return ans;
        }
        
        ans[0] = firstOccur(nums, target);
        ans[1] = lastOccur(nums, target);

        return ans;
    }

    public int firstOccur(int nums[], int target){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public int lastOccur(int nums[], int target){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                ans = mid;
                start = mid + 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
