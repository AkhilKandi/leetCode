/** 21. Merge Two Sorted Lists
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res= new ListNode(-1);
        ListNode temp =res;
        while( l1 != null && l2 !=null){
            if(l1.val <= l2.val){
                res.next = l1;
                l1 = l1.next;
                res = res.next;
            }
            else {
                res.next = l2;
                l2 = l2.next;
                res = res.next;
            }
        }
        if(l1 ==null){
            while(l2 != null){
                res.next =l2;
                l2=l2.next;
                res = res.next;
            }
        }else{
            while(l1 != null){
                res.next =l1;
                l1=l1.next;
                res = res.next;
            }
        }
        return temp.next;
    }
}
