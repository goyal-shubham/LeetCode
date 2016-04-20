/**
 * Created by shubhamgoyal on 4/19/16.
 */
public class MergeTwoSortedLists21 {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
        {
            return null;
        }
        if(l1 == null)
        {
            return l2;
        }
        if( l2 == null)
        {
            return l1;
        }

        ListNode head;
        if(l1.val < l2.val)
        {
            head = l1;
            l1 = l1.next;
        }
        else
        {
            head = l2;
            l2 = l2.next;
        }
        ListNode temp = head;

        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                temp.next = l1;
                l1 = l1.next;
            }
            else
            {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        while(l1 != null)
        {
            temp.next = l1;
            temp = l1;
            l1 = l1.next;
        }

        while(l2 != null)
        {
            temp.next = l2;
            temp = l2;

            l2 = l2.next;
        }

        temp.next = null;
        return head;

    }
}