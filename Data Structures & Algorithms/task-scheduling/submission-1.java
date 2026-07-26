class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] c = new int[26];
        for (char t : tasks) {
            c[t - 'A']++;
        }
        int m = 0;    
        int max = 0;  
        for (int i : c) {
            if (i > m) {
                m = i;
                max = 1; 
            } else if (i == m && m > 0) {
                max++;   
            }
        }
        int ti = (m - 1) * (n + 1) + max;
        return Math.max(tasks.length, ti);
    }
}
