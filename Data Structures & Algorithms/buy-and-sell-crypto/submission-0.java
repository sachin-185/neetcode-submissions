class Solution {
    public int maxProfit(int[] prices) {
        int m = 0;
        int maxp = prices[0];
        for(int s : prices){
            m = Math.max(m, s - maxp);
            maxp = Math.min(maxp, s);
        }
        return m;
    }
}
