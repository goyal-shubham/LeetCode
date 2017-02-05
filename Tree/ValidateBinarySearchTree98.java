package Tree;

/**
 * Created by shubham.goyal on 2/2/17.
 */
public class ValidateBinarySearchTree98 {

    public boolean isValidBST(TreeNode root) {

        if(root == null) {
            return true;
        }

        return isValidBSTAux(root , Long.MIN_VALUE, Long.MAX_VALUE);

    }

    public boolean isValidBSTAux(TreeNode root, long min, long max) {
        if(root == null) {
            return true;
        }

        if(root.val >= max || root.val <= min) {
            return false;
        }
        return isValidBSTAux(root.left , min , root.val)
                && isValidBSTAux(root.right , root.val, max);


    }
}
