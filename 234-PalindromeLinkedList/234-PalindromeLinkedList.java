// Last updated: 14/07/2026, 14:51:05
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
    public boolean isPalindrome(ListNode head) {
        ListNode tail=null;
        ListNode temp= head;

        while(temp!= null){
            ListNode n=new ListNode(temp.val);
            n.next=tail;
            tail=n;
            temp=temp.next;
        }
        ListNode res = tail;
        temp=head;
        while (temp!= null){
            if(temp.val!= res.val){
                return false;
            }
            else {
                temp=temp.next;
                res=res.next;
            }
        }
        return true;
    }
}