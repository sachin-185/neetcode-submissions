class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n+1];
        dp[n-1] = 1;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if(grid[i][j] == 1) dp[j] = 0;
                else dp[j]+=dp[j+1];
            }
        }
        return dp[0];
    }
}