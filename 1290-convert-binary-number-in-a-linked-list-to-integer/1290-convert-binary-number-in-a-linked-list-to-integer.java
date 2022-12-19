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
    public int getDecimalValue(ListNode head) {
        int size = listSize(head);
        int res = 0;
        int i = size-1;
        while(head!=null){
            int pow = (int) Math.pow(2, i);
            res = res + head.val*pow;
            i--;
            head = head.next;
        }
        return res;
    }
    public int listSize(ListNode head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
}