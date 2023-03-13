/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return symmetricity(root, root);
    }
    
    public static boolean symmetricity(TreeNode x, TreeNode y) {
        if (x == null || y == null) {
            return x == y;
        }
        
        return x.val == y.val && symmetricity(x.left, y.right) && symmetricity(x.right, y.left);
    }
}