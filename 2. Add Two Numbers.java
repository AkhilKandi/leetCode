/** 2. Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
==================================
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1 == null && l2 == null) return null;
        ListNode temp = new ListNode(-1);
        
        ListNode res = temp;
        
        int carry =0;
        
        while(l1 != null && l2 != null){
            
            int val = l1.val+l2.val+carry;
            if(val>9){
                carry =1;
                val = val%10;
            }else 
                carry =0;

            temp.next= new ListNode(val);
            temp = temp.next;
            l1=l1.next;
            l2=l2.next;
           
        }
        
        while(l1 != null){
            int val = l1.val+carry;
            
            if(val>9){
                carry =1;
                val = val%10;
            }else 
                carry =0;

            temp.next= new ListNode(val);
            temp = temp.next;
            l1=l1.next;
            
        }
        
        while(l2 != null){
            int val = l2.val+carry;
            
            if(val>9){
                carry =1;
                val = val%10;
            }else 
                carry =0;

            temp.next= new ListNode(val);
            temp = temp.next;
            l2=l2.next;
            
        }
        
        if(carry == 1){
            temp.next = new ListNode(carry);
        }
        
        
        return res.next;
    }
}
