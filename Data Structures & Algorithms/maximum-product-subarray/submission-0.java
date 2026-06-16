class Solution {
    public int maxProduct(int[] nums) {
        int r =nums[0];
        int cm= 1, ci = 1;
        for(int n : nums){
            int tmp = cm * n;
            cm = Math.max(Math.max(n * cm, n * ci), n);
            ci = Math.min(Math.min(tmp, n * ci), n);
            r = Math.max(r, cm);
        }
        return r;
    }
}
