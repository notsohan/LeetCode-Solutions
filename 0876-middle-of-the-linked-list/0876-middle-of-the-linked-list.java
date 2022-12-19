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
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        ListNode temp = curr.next;
        while(temp!=null){
            temp = temp.next;
            if(temp!=null){
                temp = temp.next;
            }
            curr = curr.next;
        }
        return curr;
    }
}