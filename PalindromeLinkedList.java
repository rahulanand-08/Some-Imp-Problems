//https://leetcode.com/problems/palindrome-linked-list/

class Solution {
    public static ListNode reverseList(ListNode head) {
        if (head==null)
            return null;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    return prev;
          
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        if (fast!=null)
            slow=slow.next;
        
        slow=reverseList(slow);
        fast=head;
        
        while(slow!=null){
           if(fast.val!=slow.val)
                return false;
        
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
}
