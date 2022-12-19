/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1 = headA;
        ListNode curr2 = headB;
        
        if(curr1==null || curr2==null) return null;
        
        int curr1Size = listSize(curr1);
        int curr2Size = listSize(curr2);
        
        int diff = Math.abs(curr1Size-curr2Size);
        
        if(curr1Size>curr2Size){
            for(int i=0; i<diff; i++){
                curr1 = curr1.next;
            }
        }else{
            for(int i=0; i<diff; i++){
                curr2 = curr2.next;
            }
        }
        while(curr1!=curr2){
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return curr1;
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