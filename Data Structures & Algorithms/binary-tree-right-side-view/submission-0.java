class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return res;
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode r = null;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if(node != null){
                    r = node;
                    q.offer(node.left);
                    q.offer(node.right);
                }
            }
            if(r!= null) res.add(r.val);
        }
        return res;
    }
}
