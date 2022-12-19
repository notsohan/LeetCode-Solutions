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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode curr = head;
        int count = 1;
        while(curr.next!=null){
            count++;
            curr = curr.next;
        }
        curr.next = head;
        k=(k%count);
        for(int i=count-k; i>1; i--){
            head = head.next;
        }
        curr = head.next;
        head.next = null;
        return curr;
    }
}