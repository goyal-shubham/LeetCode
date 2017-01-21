package MixSolutions;

/**
 * Created by shubhamgoyal on 4/15/16.
 */
public class ConvertSortedArraytoBinarySearchTree108
{

	public TreeNode sortedArrayToBST(int[] nums)
	{
		return buildBST(0, nums.length - 1, nums);
	}

	private TreeNode buildBST(int low, int high, int[] nums)
	{

		if (low > high)
		{
			return null;
		}
		int mid = (low + high) / 2;

		TreeNode root = new TreeNode(nums[mid]);
		root.left = buildBST(low, mid - 1, nums);
		root.right = buildBST(mid + 1, high, nums);
		return root;
	}


}
