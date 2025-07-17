// Leetcode questions -1446
public class D26Q1ConsecutiveCharacters {
    public int maxPower(String s) {
        int max = 1;
        int count = 1;

        for(int i = 1; i < s.length(); i++){
            int prev = s.charAt(i - 1);
            int curr = s.charAt(i);

            if(curr == prev){
                count++;
            }
            else{
                max = Math.max(count, max);
                count = 1;
            }
        }

        max = Math.max(count, max);

        return max;
    }
}
