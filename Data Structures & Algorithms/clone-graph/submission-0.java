/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Node, Node> oldToNew = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        oldToNew.put(node, new Node(node.val));
        q.add(node);

        while(!q.isEmpty()){
            Node cur = q.poll();
            for(Node n : cur.neighbors){
                if(!oldToNew.containsKey(n)){ 
                    oldToNew.put(n,new Node(n.val));
                    q.add(n);
                }
                oldToNew.get(cur).neighbors.add(oldToNew.get(n));
            }
        }
        return oldToNew.get(node);
    }
}