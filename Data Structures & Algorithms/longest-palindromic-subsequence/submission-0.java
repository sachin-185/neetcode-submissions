class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[] dp = new int[n];
        for(int i = n-1;i>=0;i--){
            dp[i]=1;
            int p=0;
            for (int j = i + 1; j < n; j++){
                int t = dp[j];
                if (s.charAt(i) == s.charAt(j)) dp[j] = p+2;
                else dp[j]=Math.max(dp[j],dp[j-1]);
                p=t;
            }
        }
        return dp[n-1];
    }
}