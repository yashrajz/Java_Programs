// Leetcode questions - 1897
public class D25Q2RedistributeCharactersToMakeAllStringsEqual {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26]; // for 'a' to 'z'

        for (String word : words) {
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
        }

        int n = words.length;
        for (int freq : count) {
            if (freq % n != 0) {
                return false;
            }
        }

        return true;
    }
}
