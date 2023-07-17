//https://leetcode.com/problems/reverse-linked-list-ii/submissions/

class Solution {
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
    if(head==null||head.next==null) 
        return head;
        
      ListNode dummy=new ListNode(-1);
      ListNode prev=dummy;
      dummy.next=head;
        
      for(int i=0;i<left-1;i++){
        prev=prev.next;
      }
        
      ListNode curr=prev.next;
      ListNode next;
        
      for(int i=0;i<right-left;i++){
        next=curr.next;
        curr.next=next.next;
        next.next=prev.next;
        prev.next=next;
      }
        
      return dummy.next;

    }
}
