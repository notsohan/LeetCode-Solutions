/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }   
        return BSTBuilder(list, 0, list.size()-1);
    }
    public TreeNode BSTBuilder(List<Integer> list, int l, int r){
        if(l>r){
            return null;
        }
        int mid = (l+r)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = BSTBuilder(list, l, mid-1);
        root.right = BSTBuilder(list, mid+1, r);
        return root;
    }
}