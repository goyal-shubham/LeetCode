package MixSolutions;

/**
 * Created by shubhamgoyal on 4/19/16.
 */
public class RemoveNthNodeFromEndofList19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = new ListNode(1000);
        temp.next = head;

        ListNode fast = temp;
        ListNode slow = temp;
        while(fast.next != null)
        {
            if(n <= 0)
            {
                slow = slow.next;
            }
            fast = fast.next;
            n--;
        }

        if(slow.next != null)
        {
            slow.next = slow.next.next;
        }

        return temp.next;
    }
}
