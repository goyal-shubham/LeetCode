/**
 * Created by shubhamgoyal on 4/15/16.
 */
public class ConvertSortedListToBinarySearchTree109
{

	public TreeNode sortedListToBST(ListNode head)
	{
		if(head == null)
		{
			return null;
		}

		ListNode pre = head;
		ListNode slow = head;
		ListNode fast = head;
		while((fast.next != null && fast.next.next != null))
		{
			pre = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		pre.next = null;
		TreeNode root = new TreeNode(slow.val);
		root.left = sortedListToBST(head);
		root.right = sortedListToBST(slow.next);
		return root;
	}




}
