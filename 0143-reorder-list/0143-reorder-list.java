class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        ListNode half = reverse(slow.next);
        slow.next = null;

        ListNode temp = head;
        ListNode nex1 = null;
        ListNode nex2 = null;
        while (half != null) {
            nex1 = temp.next;
            nex2 = half.next;
            half.next = temp.next;
            temp.next = half;

            temp = nex1;
            half = nex2;
        }

    }
    private ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode nex = null;
        if (head == null || head.next == null) return head;
        while (curr != null) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        head = prev;
        return head;
    }
}