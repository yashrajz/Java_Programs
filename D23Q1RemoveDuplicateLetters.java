// Leetcode questions - 316

import java.util.Stack;

public class D23Q1RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();    
        boolean[] used = new boolean[26];           
        int[] lastIndex = new int[26];   

        // Filling lastIndex
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        // traversing each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (used[c - 'a']) {
                continue; // skip if already in result
            }
            while (!stack.isEmpty() &&
                   c < stack.peek() &&
                   lastIndex[stack.peek() - 'a'] > i) {
                char removed = stack.pop();
                used[removed - 'a'] = false; // mark as removed
            }

            // Add current letter
            stack.push(c);
            used[c - 'a'] = true;
        }

        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }
}
