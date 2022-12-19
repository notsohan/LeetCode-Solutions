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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr = list1;
        if(curr==null) return list2;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = list2;
        
        int size = listSize(list1);
        for(int i=0; i<size; i++){
            ListNode currNode = list1;
            ListNode nextNode = list1.next;
            for(int j=0; j<size-i-1; j++){
                if(currNode.val>nextNode.val){
                    int temp = currNode.val;
                    currNode.val = nextNode.val;
                    nextNode.val = temp;
                }
                currNode = nextNode;
                nextNode = nextNode.next;
            }
        }
        return list1;
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