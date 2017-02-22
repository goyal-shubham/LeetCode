package List;

import java.util.*;
/**
 * Created by shubham.goyal on 2/15/17.
 */
public class RemoveDuplicateFromSortedList83 {

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) {
            return head;
        }

        ListNode prev = head;
        ListNode temp = head.next;
        int preVal = head.val;

        while(temp != null) {
            if(temp.val == preVal) {
                prev.next = temp.next;
            }
            else{
                prev = temp;
            }
            preVal = prev.val;
            temp = temp.next;
        }

        return head;
    }


}
