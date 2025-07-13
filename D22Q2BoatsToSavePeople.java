// Leetcode questions - 881

import java.util.Arrays;

public class D22Q2BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int start = 0;
        int end = people.length - 1;
        int count = 0;

        while(start <= end){

            if(people[start] + people[end] <= limit){
                start++;
                end--;
            }
            else{
                end--;
            }
            count++;
        }
        return count;
    }
}
