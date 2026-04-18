class Solution {
    public int[] twoSum(int[] nums, int t) {
        Map<Integer, Integer> in = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            in.put(nums[i],i);
        }
        for(int i = 0; i < n; i++){
            int d = t - nums[i];
            if(in.containsKey(d) && in.get(d) != i){
                return new int[]{i, in.get(d)};
            }
        }
        return new int[0];
    }
}
