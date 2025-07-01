import java.util.HashMap;

// Leetcode question - 1394
public class D10Q1FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int result = -1;

        for (int num : hm.keySet()) {
            if (num == hm.get(num)) {
                result = Math.max(result, num);
            }
        }

        return result;
    }
}
