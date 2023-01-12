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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        else if(root.val>key){
            root.left = deleteNode(root.left, key);
        }else if(root.val<key){
            root.right = deleteNode(root.right, key);
        }else{
            if(root.left==null && root.right==null){
                root = null;
            }else if(root.right==null || root.left==null){
                return root.right==null ? root.left : root.right;
            }else{
                TreeNode temp = new TreeNode(findMin(root.right));
                root.val = temp.val;
                root.right = deleteNode(root.right, temp.val);
            }
        }
        return root;
    }
    public int findMin(TreeNode root){
        if(root==null) return -1;
        if(root.left==null){
            return root.val;
        }
        return findMin(root.left);
    }
}