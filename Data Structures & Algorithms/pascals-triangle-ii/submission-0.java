class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> r = new ArrayList<>(Collections.nCopies(rowIndex+1,1));
        for(int i = 1; i < rowIndex;i++){
            for(int j=i;j>0;j--){
                r.set(j,r.get(j)+r.get(j-1));
            }
        }
        return r;
    }
}