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
    //     if(root==null){
    //         return true;
    //     } else return isSubBSTLesser(root.left, root.val)
    //             && isSubBSTGreater(root.right, root.val)
    //             && isValidBST(root.left)
    //             && isValidBST(root.right);
    // }
    // public static boolean isSubBSTLesser(TreeNode root, int val){
    //     if(root==null) return true;
    //     return root.val < val && isSubBSTLesser(root.left, val) && isSubBSTLesser(root.right, val);
    // }
    // public static boolean isSubBSTGreater(TreeNode root, int val){
    //     if(root==null) return true;
    //     return root.val > val && isSubBSTGreater(root.right, val) && isSubBSTGreater(root.left, val);
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