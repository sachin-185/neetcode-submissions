class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        Node head = root;
        while (head.left != null) {
            Node cur = head;
            while (cur != null) {
                cur.left.next = cur.right;
                if (cur.next != null) {
                    cur.right.next = cur.next.left;
                }
                cur = cur.next;
            }
            head = head.left;
        }
        return root;
    }
}