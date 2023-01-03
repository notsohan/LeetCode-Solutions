/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
//         if(head==null) return null;
//         ListNode curr = head;
//         HashSet<ListNode> hs = new HashSet<ListNode>();
        
//         while(curr!=null){
//             if(hs.contains(curr)){
//                 return curr;
//             }
//             hs.add(curr);
//             curr = curr.next;
//         }
//         return null;
        if(head==null) return null;
        ListNode fast=head, slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) {
                slow = head;
                while(slow!=fast){
                    slow= slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}