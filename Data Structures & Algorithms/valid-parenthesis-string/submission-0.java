class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i = n-1;i>=0;i--){
            boolean[] nd = new boolean[n+1];
            for(int o = 0;o < n;o++){
                if(s.charAt(i)== '*'){
                    nd[o] = dp[o+1] || (o > 0 && dp[o-1]) || dp[o];
                }
                else if(s.charAt(i)=='(') nd[o] = dp[o+1];
                else if(o > 0) nd[o] = dp[o-1];
            }
            dp=nd;
        }
        return dp[0];
    }
}
