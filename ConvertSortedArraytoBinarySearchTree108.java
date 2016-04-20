/**
 * Created by shubhamgoyal on 4/15/16.
 */
public class ConvertSortedArraytoBinarySearchTree108 {

    public TreeNode sortedArrayToBST(int[] nums) {

        TreeNode root = new TreeNode();

        int s = nums.length / 2;

        BinaryTreeInorderTraversal94 b = new BinaryTreeInorderTraversal94();
        b.inorderTraversal(root);

        return root;
    }

}
