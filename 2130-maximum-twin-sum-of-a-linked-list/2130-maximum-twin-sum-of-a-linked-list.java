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
    public int pairSum(ListNode head) {
        ListNode curr = head;
        int maxSum = 0;
        // HashMap<Integer, Integer> hs = new HashMap<>();
        // int i=0;
        // while(curr!=null){
        //     hs.put(i, curr.val);
        //     curr = curr.next;
        //     i++;
        // }
        // int size=i;
        // for(int j=0, k=i-1; j<size; j++, k--){
        //     int sum = hs.get(j) + hs.get(k);
        //     if(maxSum<sum){
        //         maxSum = sum;
        //     }
        // }
        // return maxSum;
        int[] nums = new int[count(head)];
        int i=0;
        while(curr!=null){
            nums[i] = curr.val;
            i++;
            curr = curr.next;
        }
        for(int j=0, k=i-1; j<nums.length; j++, k--){
            int sum = nums[j]+nums[k];
            if(maxSum<sum){
                maxSum=sum;
            }
        }
        return maxSum;
    }
    public int count(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
}