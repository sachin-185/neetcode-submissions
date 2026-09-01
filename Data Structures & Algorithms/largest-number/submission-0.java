class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] s = new String[n];
        for(int i = 0; i < n; i++){
            s[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));

        if(s[0].equals("0")) return "0";  // edge case
        StringBuilder r = new StringBuilder();
        for(String i : s){
            r.append(i);
        }
        return r.toString();
    }
}