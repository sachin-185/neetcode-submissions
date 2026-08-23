public class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        backtrack(nums, 0);
        return res;
    }

    private void backtrack(int[] nums, int idx) {
        if (idx == nums.length) {
            List<Integer> p = new ArrayList<>();
            for(int n : nums) p.add(n);
            res.add(p);
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            backtrack(nums, idx+1);
            swap(nums, idx, i);
        }      
    }

    private void swap(int[] nums, int i, int j){
        int t =nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}