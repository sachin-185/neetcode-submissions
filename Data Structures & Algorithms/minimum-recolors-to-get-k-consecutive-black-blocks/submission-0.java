class Solution {
    public int minimumRecolors(String blocks, int k) {
        int c = 0;
        for(int i = 0; i < k; i++){
            if(blocks.charAt(i) == 'W'){
                c++;
            }
        }

        int r = c;
        for(int i = k; i < blocks.length(); i++){
            if(blocks.charAt(i - k) == 'W'){
                c--;
            }
            if(blocks.charAt(i) == 'W'){
                c++;
            }
            r = Math.min(r, c);
        }
        return r;
    }
}