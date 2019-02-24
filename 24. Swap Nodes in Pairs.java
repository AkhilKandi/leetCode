/** 24. Swap Nodes in Pairs
Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes, only nodes itself may be changed.

Example:
Given 1->2->3->4, you should return the list as 2->1->4->3.
============================================================
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null )return null;
        if(head.next == null ) return head;
        ListNode prev = null ; 
        ListNode next = null ; 
        ListNode curr = head ; 
       int i=0;
        while(i<2){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }
        if(next != null )
        head.next = swapPairs(curr);
     
        return prev;
    }
}
