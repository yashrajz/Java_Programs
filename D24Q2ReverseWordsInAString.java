// Leetcode questions - 151
public class D24Q2ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+"); //splitting the string with space

        StringBuilder sb = new StringBuilder("");

        for(int i = str.length - 1; i >= 0; i--){
            sb.append(str[i] + " ");
        }

        String ans = sb.toString();

        ans = ans.trim();

        return ans;


    }
}
