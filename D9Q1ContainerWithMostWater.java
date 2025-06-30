// Leetcode question - 11
public class D9Q1ContainerWithMostWater {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;

        int maxCap = 0;
        while(left < right){

            int h = Math.min(height[left], height[right]);
            int w = right - left;

            int currCap = h * w;
            maxCap = Math.max(currCap, maxCap);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return maxCap;
}
