class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>r = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        dfs(nums,0,s,r);
        return r;
    }

    private void dfs(int[] nums, int i, List<Integer> s ,List<List<Integer>> r){
        if(i >= nums.length){
            r.add(new ArrayList<>(s));
            return;
        }
        s.add(nums[i]);
        dfs(nums,i+1,s,r);
        s.remove(s.size() - 1);
        dfs(nums,i+1,s,r);
    }
}
 