package MixSolutions;

/**
 * Created by shubhamgoyal on 4/20/16.
 */

public class PartitionList86 {

    public ListNode partition(ListNode head, int x) {

        if(head == null)
        {
            return null;
        }

        ListNode slow = new ListNode(0);
        ListNode large = new ListNode(0);

        slow.next = null;
        large.next = null;

        ListNode newHead = slow;
        ListNode largeStart = large;


        while(head != null)
        {
            if(head.val < x)
            {
                slow.next  = head;
                slow = slow.next;
            }
            else
            {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }

        slow.next = largeStart.next;
        large.next = null;
        return newHead.next;

    }
}
