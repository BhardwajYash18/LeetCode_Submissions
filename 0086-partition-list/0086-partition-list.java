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
        if (head == null || head.next == null) return head;
        ListNode small = null;
        ListNode high = null;
        ListNode temp = head;
        ListNode small_tail = null;
        ListNode high_tail = null;
        while (temp != null){
            ListNode next = temp.next;
            temp.next = null;
            if (temp.val < x) {
                if (small == null) {
                    small = temp;
                    small_tail = small;
                }
                else {
                    small_tail.next = temp;
                    small_tail = small_tail.next;
                }
            }
            else {
                if (high == null) {
                    high = temp;
                    high_tail = high;
                }
                else {
                    high_tail.next = temp;
                    high_tail = high_tail.next;
                }
            }
            temp = next;
        }
        if (small != null ) small_tail.next = high;
        else small = high;
        return small;
    }
}