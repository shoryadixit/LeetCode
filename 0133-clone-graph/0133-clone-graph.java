/*
// Definition for a Node.
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
    public static void dfs(Node node, Node copy, Node[] visitedNodes) {
        visitedNodes[copy.val] = copy;
        
        for (Node n: node.neighbors) {
            if (visitedNodes[n.val] == null) {
                Node newNode = new Node(n.val);
                copy.neighbors.add(newNode);
                dfs(n, newNode, visitedNodes);
            } else {
                copy.neighbors.add(visitedNodes[n.val]);
            }
        }
    }
    
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        
        Node copy = new Node(node.val);
        
        Node[] visitedNodes = new Node[101];
        
        Arrays.fill(visitedNodes, null);
        
        dfs(node, copy, visitedNodes);
        
        return copy;
    }
}