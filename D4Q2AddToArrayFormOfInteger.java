// Leetcode - 989

import java.util.ArrayList;
import java.util.List;

public class D4Q2AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();  
        int i = num.length - 1;  

        while (i >= 0 || k > 0) {   // as long as there's something to add
            if (i >= 0) {
                k += num[i];    // adding num’s digit to k
                i--;            // moving to the next digit on the left
            }
            res.addFirst(k % 10);  // taking the last digit and puting it at the front
            k /= 10;               // removing the last digit
        }

        return res;  
    }
}
