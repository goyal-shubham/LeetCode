/**
 * Created by shubhamgoyal on 4/19/16.
 */
public class ReverseLinkedListII92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null)
        {
            return null;
        }

        ListNode root = new ListNode(1000);
        root.next = head;

        ListNode temp = head;
        ListNode front = root;
        ListNode back = head;


        int i = 1;
        while(i < m)
        {
            front = front.next;
            temp = temp.next;
            back = temp;
            i++;
        }

        ListNode prev = null;

        while(i <= n)
        {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            i++;
        }

        front.next = prev;
        back.next = temp;

        return root.next;



    }
}
