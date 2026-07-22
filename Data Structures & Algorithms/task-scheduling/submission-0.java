class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] c = new int[26];
        for(char t : tasks) c[t-'A']++;

        int m = Arrays.stream(c).max().getAsInt();
        int max = 0;
        for(int i : c){
            if(i==m) max++;
        }
        int ti = (m - 1) * (n + 1) + max;
        return Math.max(tasks.length, ti);
    }
}
