/**
 * Created by shubhamgoyal on 4/19/16.
 */
public class RemoveDuplicatesfromSortedListII82 {

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null)
        {
            return null;
        }
        ListNode root = new ListNode(1000);
        root.next = head;
        ListNode temp = head;
        ListNode temp1 = head.next;
        ListNode temp2 = root;


        int i = temp.val;
        boolean flag =false;
        while(temp1 != null)
        {
            if(i == temp1.val)
            {
                temp1 = temp1.next;
                flag = true;
            }
            else
            {
                if( flag )
                {
                    temp = temp1;
                    temp1 = temp.next;

                }
                else
                {
                    temp2.next = temp;
                    temp2 = temp;
                    temp = temp.next;
                    temp1 = temp1.next;
                }
                flag = false;
                i = temp.val;
            }
        }
        if(flag)
        {
            temp2.next = null;
        }
        return root.next;
    }
}