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
    public ListNode middleNode(ListNode head) {
        
        
        ListNode temp=head;
        if(head==null) return null;
        int size=1;

        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        
        int mid=size/2;

        for(int i=0;i<mid;i++){
            head=head.next;
        }
        return head;

    }
}