package List;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class RemoveNthNodeFromEndofList19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;
        ListNode end = dummy;
        while(n-- > 0) {
            end = end.next;
        }


        while(end.next != null) {
            temp = temp.next;
            end = end.next;
        }

        temp.next = temp.next.next;

        return dummy.next;
    }
}
