package List;

/**
 * Created by shubham.goyal on 2/22/17.
 */
public class PalindromeLinkedList234 {

    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = reverseList(slow.next);
        slow.next = null;
        while(firstHalf != null && secondHalf != null) {
            if(firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        if(firstHalf != null && firstHalf.next != null) {
            return false;
        }
        if(secondHalf != null && secondHalf.next != null) {
            return false;
        }

        return true;
    }

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;
        while(current != null) {

            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;

    }
}
