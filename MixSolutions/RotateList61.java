package MixSolutions;

/**
 * Created by shubhamgoyal on 4/21/16.
 */
public class RotateList61 {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null)
        {
            return null;
        }

        if(k == 0)
        {
            return head;
        }
        ListNode first = head;
        int count = 0;
        ListNode temp = head;
        while( k-- > 0)
        {
            count++;
            temp = temp.next;
            if(temp == null)
            {
                k = k % count;
                temp = first;
            }

        }

        ListNode temp1 = head;
        while(temp.next != null)
        {
            temp = temp.next;
            temp1 = temp1.next;
        }

        temp.next = first;
        head = temp1.next;
        temp1.next = null;

        return head;
    }
}
