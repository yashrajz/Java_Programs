// Leetcode questions - 394

import java.util.Stack;

public class D25Q1DecodeString {
    public String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        
        StringBuilder currentStr = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            else if (c == '[') {
                numStack.push(num);
                strStack.push(currentStr.toString());
                currentStr = new StringBuilder();
                num = 0;
            }
            else if (c == ']') {
                int repeatTimes = numStack.pop();
                StringBuilder decoded = new StringBuilder(strStack.pop());
            
                for (int i = 0; i < repeatTimes; i++) {
                    decoded.append(currentStr);
                }
                currentStr = decoded;
            }
            else {
                currentStr.append(c);
            }
        }

        return currentStr.toString();
    }
}
