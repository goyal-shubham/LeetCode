package MixSolutions;

/**
 * Created by shubhamgoyal on 4/21/16.
 */
public class ReorderList143 {

    public static ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        while(head != null)
        {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void mergeList(ListNode head, ListNode head1)
    {
        while(head1 != null)
        {
            ListNode next1 = head.next;
            ListNode next2 = head1.next;
            head.next = head1;
            head1.next = next1;
            head = next1;
            head1 = next2;
        }
        head.next = null;
    }

    public static void print(ListNode temp)
    {
        while(temp != null)
        {
            System.out.println(temp.val);
            temp = temp.next;
        }

    }

    public static void reorderList(ListNode head) {

        if(head == null || head.next == null)
        {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null)
        {
            slow = slow.next;
        }

        ListNode head1 = reverseList(slow);
        ListNode temp = head;

//        while(head1 != null)
//        {
//            ListNode next2 = head1;
//            head1 = head1.next;
//            next2.next = temp.next;
//            temp.next = next2;
//            temp = temp.next.next;
//        }

        mergeList(temp, head1);

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = null;

        ListNode temp = l1;

        reorderList(l1);
        print(l1);
        //        while(l1 != null)
//        {
//            System.out.println(l1.val);
//            l1 = l1.next;
//        }

    }
}
