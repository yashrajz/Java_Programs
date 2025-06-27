// Leetcode question - 977
public class D6Q2SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;
        int ptr = res.length - 1;

        while(start <= end){
            int startsq = nums[start] * nums[start];
            int endsq = nums[end] * nums[end]; 

            if(startsq > endsq){
                res[ptr] = startsq;
                start++;
            }
            else{
                res[ptr] = endsq;
                end--;
            }
            ptr--;

        }
       return res;

    }
}
