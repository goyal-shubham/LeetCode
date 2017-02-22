package List;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class LinkedListCycle141 {

    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if( slow == fast) {
                return true;
            }
        }

        return false;
    }
}
