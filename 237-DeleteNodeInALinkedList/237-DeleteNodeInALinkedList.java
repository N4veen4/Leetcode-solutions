// Last updated: 14/07/2026, 14:51:04
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        
            //  ListNode temp= head;
            // if(temp.val == node.val){
            //     ListNode x= temp.val;
            //     temp.val=temp.next.val;
            //     temp=temp.next.next;
            //     return;


            // }else{
            //     temp=temp.next;

            node.val=node.next.val;
            node.next=node.next.next;
            }
            
        }
    

