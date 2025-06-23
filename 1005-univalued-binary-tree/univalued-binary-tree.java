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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        return sol(root.val, root);
    }
    public static boolean sol(int n, TreeNode root){
        if(root==null) return true;
        if(root.val!=n) return false;
        boolean left = sol(n, root.left);
        boolean right = sol(n, root.right);
        return left && right;
    }
}