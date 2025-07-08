// Leetcode questions - 66
public class D17Q2PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // else it's 9 becomes 0 and carry continues
            digits[i] = 0;
        }

        // If all digits were 9, increase the size of array
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
}
