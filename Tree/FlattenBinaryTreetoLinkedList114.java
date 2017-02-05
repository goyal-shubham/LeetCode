package Tree;

/**
 * Created by shubham.goyal on 2/3/17.
 */
public class FlattenBinaryTreetoLinkedList114 {

    public void flatten(TreeNode root) {
        if(root == null) {
            return;
        }

        flatten(root.left);
        flatten(root.right);

        TreeNode node = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode temp = root;
        while(temp.right != null) {
            temp = temp.right;
        }
        temp.right = node;
    }
}
