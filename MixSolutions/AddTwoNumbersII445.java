package MixSolutions;

/**
 * Created by shubham.goyal on 12/7/16.
 */
public class AddTwoNumbersII445 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */


    public int countNoOfElements(ListNode head) {

        int count = 0;
        ListNode temp = head;
        while (temp != null) {

            temp = temp.next;
            count++;
        }

        return count;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int listCount1 = countNoOfElements(l1);
        int listCount2 = countNoOfElements(l2);

        if(listCount1 > listCount2) {
            ListNode temp = l2;
            l2 = l1;
            l1 = temp;
        }

        return l1;
    }

}
