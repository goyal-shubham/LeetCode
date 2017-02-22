package List;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class RemoveLinkedListElements203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode temp = head;
        while(temp != null) {

            if(temp.val == val) {
                prev.next = temp.next;
            }
            else{
                prev = prev.next;
            }
            temp = temp.next;
        }

        return dummy.next;
    }
}
