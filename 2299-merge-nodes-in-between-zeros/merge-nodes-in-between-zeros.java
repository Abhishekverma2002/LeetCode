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
    public ListNode mergeNodes(ListNode head) {
        ListNode prev= new ListNode(0);
        ListNode prevhead= prev;
        ListNode temp= head;
        int sum=0;
        while(temp!=null){
           sum+=temp.val;
           if(temp.val==0){
               ListNode press= new ListNode(sum);
               prev.next=press;
               prev=prev.next;
               sum=0;

            }
           temp=temp.next;
        }
        return prevhead.next.next;
        
    }
  }
 