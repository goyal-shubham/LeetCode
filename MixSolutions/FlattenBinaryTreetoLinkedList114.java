package MixSolutions;

/**
 * Created by shubhamgoyal on 3/30/16.
 * Given a binary tree, flatten it to a linked list in-place.
 */
public class FlattenBinaryTreetoLinkedList114

{

    public void flatten(TreeNode root)
    {

        if(root == null)
        {
            return;
        }


        flatten(root.right);
        flatten(root.left);

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;

        while(root.right != null)
        {
            root = root.right;
        }
        root.right = temp;
    }
}
