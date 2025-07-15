// Leetcode questions - 443
public class D24Q1StringCompression {
    public int compress(char[] chars) {
        int reader = 0;
        int writer = 0;

        while(reader < chars.length){
            int count = 0;
            char ch = chars[reader];

            while(reader < chars.length && chars[reader] == ch){
                count++;
                reader++;
            }
            chars[writer++] = ch;

            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[writer++] = c;
                }
            }

        }

        return writer;
    }
}
