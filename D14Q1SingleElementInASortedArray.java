// Leetcode questions - 540
public class D14Q1SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        else if(nums[0] != nums[1]){
            return nums[0];
        }
        else if(nums[nums.length - 1] != nums[nums.length - 2]){
            return nums[nums.length - 1];
        }


        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]){
                return nums[mid];
            }
            else if(mid % 2 == 0){          //mid is on even index
                if(nums[mid] == nums[mid + 1]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{                           //mid is on odd index
                if(nums[mid] == nums[mid - 1]){
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
