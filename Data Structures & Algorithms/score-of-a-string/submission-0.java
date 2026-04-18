public class Solution {
    public int scoreOfString(String s) {
        int r = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            r += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return r;
    }
}