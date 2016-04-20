/**
 * Created by shubhamgoyal on 4/19/16.
 */
public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
        if(head == null)
        {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null )
        {

            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }

        }
        return false;
    }
}

