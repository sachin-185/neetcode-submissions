class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length(), n = t.length();
        boolean[][] dp = new boolean[m+1][n+1];
        for(int i = 0 ; i <= n; i++){
            dp[m][i] = true;
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (s.charAt(i) == t.charAt(j)) dp[i][j] = dp[i + 1][j + 1];
                else dp[i][j] = dp[i][j + 1];
            }
        }
        return dp[0][0];
    }
}