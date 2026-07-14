// Last updated: 14/07/2026, 14:52:09
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *///if(k<0 || k>2*(int)Math.pow(10,9)){
          //  return head;
 //}
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        ListNode store=head;
        int count=0;
        while(store!=null){
            count++;
            store=store.next;
        }
        while(k>count){
            k = k-count;
        }

        for(int i =0;i<k;i++){
            ListNode temp=head;
            
           
            while(temp!=null && temp.next!=null){
                
                if(temp.next.next==null){
                    ListNode prehead=null;
                    prehead=temp.next;
                   // return head;
                    temp.next=null;
                    prehead.next=head;
                    head=prehead;
                    break;
                }
                temp=temp.next;
            }
        } return head;
    }
}