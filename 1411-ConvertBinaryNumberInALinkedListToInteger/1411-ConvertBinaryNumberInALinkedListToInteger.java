// Last updated: 14/07/2026, 14:49:43
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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int value =0;

        while(temp!=null){
            value=value*2 + temp.val;
            temp=temp.next;
        }


//         int sum = 0;
//         int last=0;
//         ListNode rev=null;

//         if(temp.val== 1 && temp.next == null){
//             return 1;
//         }else if(temp.val==0 && temp.next ==null){
//             return 0;
//         }

//         while (temp!=null){
//             ListNode n= new ListNode(temp.val);
//             n.next=rev;
//             rev=n;
//             temp=temp.next;
//         }
//         ListNode res=rev.next;
        
//             // if(rev.val==1){
//             //     sum+=1;
//             // }else{
//             //     sum+=0;
//             // }
        

//         while (res!=null){
//             value=value+value;
//             if(res.val == 1){
//                 sum = value;
                
//                 res=res.next;
//             }else{
//             res=res.next;
//             }
//             last = value;
    
//         if(rev.val == 1){
//             sum+=1;
//             }
//         else {
//             sum+=0;
//         }
// }
        
        return value;

    }
}

