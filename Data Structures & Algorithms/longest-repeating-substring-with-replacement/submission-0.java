class Solution {
    public int characterReplacement(String s, int k) {
        int[] charFreq = new int[26];
        int left = 0, maxFreq = 0;
        int n = s.length();

        for (int right = 0; right < n; right++) {
            int idx = s.charAt(right) - 'A';
            charFreq[idx]++;
            maxFreq = Math.max(maxFreq, charFreq[idx]);

            int windowSize = right - left + 1;
            if (windowSize - maxFreq > k) {
                int leftIdx = s.charAt(left) - 'A';
                charFreq[leftIdx]--;
                left++;
            }
        }
        return n - left;
    }
}