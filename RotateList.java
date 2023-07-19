//https://leetcode.com/problems/rotate-list/description/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null) {
            return head;
        }
        int len = 1;
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }
        curr.next=head;
        ListNode newHead = head;
        for (int i = 0; i < len - k - 1; i++) {
            newHead = newHead.next;
        }
        System.out.println(newHead.val);
        ListNode temp = newHead.next;
        System.out.println(newHead.val);
        newHead.next = null;
        return temp;
    }
}
