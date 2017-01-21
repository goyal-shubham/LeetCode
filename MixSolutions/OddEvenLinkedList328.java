package MixSolutions;

/**
 * Created by shubhamgoyal on 4/19/16.
 */
public class OddEvenLinkedList328 {

    public ListNode oddEvenList(ListNode head) {
        if(head == null)
        {
            return null;
        }

        ListNode temp = head;
        ListNode temp1 = head.next;
        ListNode root = temp1;
        while(temp1 != null && temp1.next != null)
        {
            temp.next = temp1.next;
            temp = temp1.next;
            temp1.next = temp.next;
            temp1 = temp.next;
        }

        temp.next = root;
        return head;
    }
}
