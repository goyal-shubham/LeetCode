package MixSolutions;

/**
 * Created by shubhamgoyal on 4/19/16.
 */
public class IntersectionofTwoLinkedLists160 {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = 0 , b = 0;

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != null)
        {
            temp1 = temp1.next;
            a++;
        }

        while(temp2 != null)
        {
            temp2 = temp2.next;
            b++;
        }
        if(temp1 != temp2)
        {
            return null;
        }

        if( a < b)
        {
            temp1 = headB;
            temp2 = headA;
        }

        int diff = a - b;
        while(diff-- > 0)
        {
            temp1 = temp1.next;
        }

        while(temp1 != temp2)
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;
    }
}
