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
    int i=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstBuilder(preorder, Integer.MAX_VALUE);
    }
    public TreeNode bstBuilder(int[] list, int maxValue){
        if(i==list.length || list[i]>maxValue){
            return null;
        }
        TreeNode root = new TreeNode(list[i++]);
        root.left = bstBuilder(list, root.val);
        root.right = bstBuilder(list, maxValue);
        return root;
    }
}