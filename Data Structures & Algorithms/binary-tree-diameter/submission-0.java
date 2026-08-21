class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        dfs(root, res);
        return res[0];
    }

    private int dfs(TreeNode root, int[] res){
        if(root==null) return 0;
        int l = dfs(root.left,res);
        int r = dfs(root.right, res);
        res[0] = Math.max(res[0], l + r);
        return 1+Math.max(l,r);
    }
}
