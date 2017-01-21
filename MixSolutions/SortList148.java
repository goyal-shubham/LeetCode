package MixSolutions;

/**
 * Created by shubhamgoyal on 4/20/16.
 */
public class SortList148 {


    public ListNode sortList(ListNode head) {

        if(head == null)
        {
            return head;
        }

        ListNode pivot = head;
        head = head.next;
        pivot.next = null;
        if (head == null)
        {
            return pivot;
        }

        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode temp = pivot;

        while(head != null)
        {
            if(head.val < pivot.val)
            {
                small.next = head;
                small = small.next;
            }
            else if(head.val > pivot.val)
            {
                large.next = head;
                large = large.next;
            }
            else
            {
                temp.next = head;
                temp = temp.next;
            }
            head = head.next;
        }

        small.next = null;
        large.next = null;
        temp.next = null;

        ListNode sorted = sortList(small.next);
        if(sorted == null)
        {
            sorted = pivot;
        }
        else
        {
            ListNode temp1 = sorted;
            while(temp1.next != null)
            {
                temp1 = temp1.next;
            }
            temp1.next = pivot;
        }
        temp.next = sortList(large.next);
        return sorted;

    }
}
