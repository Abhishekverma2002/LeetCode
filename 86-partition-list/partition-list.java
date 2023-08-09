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

    public ListNode partition(ListNode head, int x) {
        ListNode prev= new ListNode(0);
        ListNode curr= prev;
        ListNode temp = head;
        ListNode temp2=head;
        while(temp!=null){
            if(temp.val<x){
                ListNode press=new ListNode(temp.val);
                curr.next=press;
                curr=curr.next;
            }

            temp=temp.next;
        }
         while(temp2!=null){
            if(temp2.val>=x){
                ListNode press=new ListNode(temp2.val);
                curr.next=press;
                curr=curr.next;
            }

            temp2=temp2.next;
        }
        return prev.next;

        
        
    }
}