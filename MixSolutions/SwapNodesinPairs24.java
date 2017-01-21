package MixSolutions;

/**
 * Created by shubhamgoyal on 4/19/16.
 */
public class SwapNodesinPairs24 {

    public ListNode swapPairs(ListNode head) {

        if( head == null || head.next == null)
        {
            return head;
        }

        ListNode temp = head.next;
        ListNode temp2 = temp.next;

        temp.next = head;
        head.next = swapPairs(temp2);

        return temp;
    }
}
