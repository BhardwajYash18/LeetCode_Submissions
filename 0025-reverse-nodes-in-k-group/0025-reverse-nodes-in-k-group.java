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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) return head;
        ListNode curr = head;
        ListNode prevTail = null;

        while (curr != null) {
            ListNode temp = curr;
            int cnt = 0;
            
            while (temp != null && cnt < k) {
                temp = temp.next;
                cnt++;
            }
            if (cnt < k)
                break;
            
            ListNode prev = null;
            ListNode now = curr;
            ListNode nex = null;

            int last = k;

            while (last > 0) {
                nex = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nex;
                last--;
            }

            if (prevTail != null) {
                prevTail.next = prev;
            }
            else
                head = prev;
            
            now.next = curr;
            prevTail = now;
        }
        return head;
    }
}