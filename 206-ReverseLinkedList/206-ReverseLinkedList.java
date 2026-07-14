// Last updated: 14/07/2026, 14:51:16
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
    public ListNode reverseList(ListNode head) {

        ListNode res = null;
        ListNode temp = head;
        while(temp!= null){
            ListNode n=new ListNode(temp.val);
            n.next=res;
            res=n;
            temp=temp.next;
        }
        return res;
    }
}