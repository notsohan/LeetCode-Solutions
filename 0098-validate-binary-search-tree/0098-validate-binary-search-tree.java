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
    public boolean isValidBST(TreeNode root) {
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean isBST(TreeNode root, long minValue, long maxValue){
        if(root==null) return true;
        if(root.val>minValue && root.val<maxValue 
           && isBST(root.left, minValue, root.val) 
           && isBST(root.right, root.val, maxValue)){
            return true;
        }else{
            return false;
        }
    }
}