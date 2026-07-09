class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        List<String> res = new ArrayList<>();

        for(String word : words){
            int m = word.length();
            boolean[] dp = new boolean[m + 1];
            dp[0] = true;
            for (int i = 1; i <= m; i++) {
                for (int j = 0; j < i; j++) {
                    if (j == 0 && i == m) continue;
                    if (dp[j] && wordSet.contains(word.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
            if(dp[m]) res.add(word);
        }
        return res;
    }
}