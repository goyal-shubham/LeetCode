/**
 * Created by shubhamgoyal on 3/31/16.
 Remove all elements from a linked list of integers that have value val.

 Example
 Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 Return: 1 --> 2 --> 3 --> 4 --> 5


 */

public class RemoveLinkedListElements203 {


    //My Solution
    public ListNode removeElements(ListNode head, int val)
    {
        ListNode temp = head;
        ListNode current = head;
        if(head == null)
        {
            return temp;
        }

        if(temp.val == val && temp.next == null)
        {
            return null;
        }

        while(temp != null)
        {
            if(temp.val == val)
            {
                if(temp.next == null)
                {
                    if(current == temp)
                    {
                        return null;
                    }

                    current.next = null;
                    break;
                }
                temp.val = temp.next.val;
                temp.next = temp.next.next;
            }
            else
            {
                current = temp;
                temp = temp.next;
            }
        }

        return head;

    }


    //More Clear Solution
    public ListNode removeElements1(ListNode head, int val)
    {
        if(head == null)
        {
            return head;
        }
        ListNode result = new ListNode(0);
        result.next = head;

        ListNode temp = result;

        while(temp.next != null)
        {
            if(temp.next.val == val)
            {
                temp.next = temp.next.next;
            }
            else
            {
                temp = temp.next;
            }
        }

        return result.next;
    }


}
