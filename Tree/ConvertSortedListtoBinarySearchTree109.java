package Tree;

/**
 * Created by shubham.goyal on 2/7/17.
 */
public class ConvertSortedListtoBinarySearchTree109 {

    public TreeNode sortedListToBST(ListNode head) {

        if(head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = dummy;
        while(fast.next != null && fast.next.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(dummy.next);
        root.right = sortedListToBST(slow.next);
        return root;
    }
}
