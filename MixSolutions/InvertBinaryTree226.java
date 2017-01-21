package MixSolutions;

/**
 * Created by shubhamgoyal on 3/31/16.
 * Invert a binary tree.

 4
 /   \
 2     7
 / \   / \
 1   3 6   9
 to
 4
 /   \
 7     2
 / \   / \
 9   6 3   1
 */
public class InvertBinaryTree226 {

    public TreeNode invertTree(TreeNode root)
    {
        if(root == null)
        {
            return null;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
