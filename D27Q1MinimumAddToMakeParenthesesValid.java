// Leetcode questions - 921
public class D27Q1MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        
        int balance = 0;
        int additions = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                balance++;
            }
            else {
                if (balance > 0) {
                    balance--;
                } else {
                    additions++;
                }
            }
        }

        return additions + balance;
    }
}
