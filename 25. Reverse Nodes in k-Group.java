/** 25. Reverse Nodes in k-Group

Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

Example:

Given this linked list: 1->2->3->4->5

For k = 2, you should return: 2->1->4->3->5

For k = 3, you should return: 3->2->1->4->5

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        // ListNode temp = head;
        // ListNode rev = temp;
        int len =0;
       
        ListNode prev =null;
        ListNode next = null;
        ListNode curr = head;
        ListNode ptr  = head;
        
        while(len < k && ptr != null){
            ptr = ptr.next;
            len++;
        }
        
        if(len == k){
            int i = 0;
            while(i<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }
        if(next != null )
        head.next = reverseKGroup(curr,k);
        }else 
             return head;
        
        return prev;
    }
}
