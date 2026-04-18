class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, t = 0;
        int res = Integer.MAX_VALUE;
        for(int r = 0; r < nums.length; r++){
            t += nums[r];
            while (t >= target) {
                res = Math.min(r - l + 1, res);
                t -= nums[l];
                l++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}