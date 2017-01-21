package MixSolutions;

/**
 * Created by shubhamgoyal on 4/19/16.
 */
public class RemoveDuplicatesfromSortedList83 {

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null)
        {
            return null;
        }

        ListNode temp = head;
        ListNode temp1 = head.next;
        int i = temp.val;
        while( temp1 != null)
        {
            if( i == temp1.val)
            {
                temp1 = temp1.next;
            }
            else
            {
                temp.next = temp1;
                temp = temp1;
                i = temp.val;
                temp1 = temp1.next;
            }

        }

        temp.next = temp1;
        return head;
    }
}
