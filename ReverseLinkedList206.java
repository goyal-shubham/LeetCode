/**
 * Created by shubhamgoyal on 4/5/16.
 */
public class ReverseLinkedList206 {


    public ListNode reverseList(ListNode head) {
        if(head == null)
        {
            return null;
        }
        ListNode prev = null;
        ListNode temp = head;

        while(temp != null)
        {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}
