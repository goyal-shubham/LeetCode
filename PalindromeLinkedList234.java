import java.util.Stack;

/**
 * Created by shubhamgoyal on 4/5/16.
 * Given a singly linked list, determine if it is a palindrome.

 Follow up:
 Could you do it in O(n) time and O(1) space?
 */
public class PalindromeLinkedList234 {

    public boolean isPalindrome(ListNode head)
    {

        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> myStack = new Stack<>();
        while( fast != null && fast.next != null)
        {
            myStack.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null)
        {
            slow = slow.next;
        }

        while(slow != null)
        {
            int data = myStack.pop();
            if(data != slow.val)
            {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

}
