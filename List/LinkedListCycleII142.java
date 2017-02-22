package List;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class LinkedListCycleII142 {

    public ListNode detectCycle(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if( slow == fast) {
                isCycle = true;
                break;
            }
        }

        if(!isCycle) {
            return null;
        }
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
