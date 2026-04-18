class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1, re = 0, ans = 0;

        while(l < r){
            ans = Math.min(heights[l], heights[r]) * (r - l);
            re = Math.max(re, ans);

            if(heights[l] > heights[r]) r--;
            else l++;
        }
        return re;
    }
}
