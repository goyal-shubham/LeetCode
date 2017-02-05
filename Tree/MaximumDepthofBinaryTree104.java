package Tree;

/**
 * Created by shubham.goyal on 2/3/17.
 */
public class MaximumDepthofBinaryTree104 {

    public int maxDepth(TreeNode root) {


        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;

    }
}
