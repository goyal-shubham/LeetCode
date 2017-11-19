package List;

/**
 * Created by shubham.goyal on 2/22/17.
 */
public class ReverseLinkedList206 {

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode current = head.next;
        prev.next = null;
        while(current != null) {

            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;

    }
}
