//https://leetcode.com/problems/merge-two-sorted-lists/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(0);
        ListNode curr=head;
        while (list1!=null && list2!=null)
        {
            if (list1.val<=list2.val)
            {
                curr.next=list1;
                list1=list1.next;
            }
            else 
            {
                curr.next=list2;
                list2=list2.next;
            }
            curr=curr.next;
        }
        return head.next;
    }

