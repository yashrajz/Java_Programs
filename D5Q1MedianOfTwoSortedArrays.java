//Leetcode question - 4

//concept: Take 3 arrays, 2-given, 1 empty;
//take 3 points- initialize all with 0 of each array;

public class D5Q1MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = merge(nums1, nums2);

        if(ans.length % 2 == 0){
            double median = (double)(ans[ans.length/2] + ans[ans.length/2 - 1])/2;
            return median;
        }
        else{
            double median = (double)(ans[ans.length/2]);
            return median;
        }
        
    }

    public int[] merge(int[] arr1, int[] arr2){
        int p1 = 0;  //taking 3 pointers for 3 arrays- 1 for each;
        int p2 = 0;
        int p3 = 0;

        int ans[] = new int[arr1.length + arr2.length];

        while(p1 < arr1.length || p2 < arr2.length){    //checking if pointer is at the end of array or not.
            int val1 = (p1 < arr1.length) ? arr1[p1] : Integer.MAX_VALUE;  // if not at end, store it value in val1
            int val2 = (p2 < arr2.length) ? arr2[p2] : Integer.MAX_VALUE;  // if not at end, store it value in val2

            if(val1 < val2){            //check which is smaller
                ans[p3] = val1;         // store smaller value in 3rd array
                p1++;                   // increase it's pointer
            }
            else{
                ans[p3] = val2;         // same for 2nd case too.
                p2++;
            }
            p3++;
        }
        return ans;                     // return the 3rd merged array in sorted order.

    }
}
