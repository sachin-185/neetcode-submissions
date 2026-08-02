class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        Node cur = root, nxt = root.left;
        while (cur != null && nxt != null) {
            cur.left.next = cur.right;
            if(cur.next != null) cur.right.next = cur.next.left;
            cur = cur.next;
            if(cur == null){
                cur = nxt;
                nxt = cur.left;
            }
        }
        return root;
    }
}