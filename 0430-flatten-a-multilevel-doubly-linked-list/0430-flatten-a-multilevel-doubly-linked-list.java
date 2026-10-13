
class Solution {
    public Node flatten(Node head) {
        Node temp = head;
        while (temp != null) {
            if (temp.child != null) {
                Node tempNext = temp.next;
                Node childHead = flatten(temp.child);

                temp.next = childHead;
                childHead.prev = temp;
                temp.child = null;
                Node tail = childHead;

                while (tail.next != null) {
                    tail = tail.next;
                }
                
                tail.next = tempNext;
                if (tempNext != null) {
                    tempNext.prev = tail;
                }
            }
            temp = temp.next;
        }
        return head;
    }
}
