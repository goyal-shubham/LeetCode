package List;

/**
 * Created by shubham.goyal on 2/16/17.
 */
public class MergeTwoSortedLists21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null || l2 == null) {
            return l2 == l1 ? null : (l2 == null ? l1 : l2);
        }

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode newHead = dummy;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                dummy.next = l1;
                l1 = l1.next;
            }
            else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }

        if(l1 != null) {
            dummy.next = l1;
        }
        else if(l2 != null) {
            dummy.next = l2;
        }

        return newHead.next;
    }
}
