package MixSolutions;

/**
 * Created by shubhamgoyal on 3/30/16.
 */
public class MaximumDepthBT104 {

    public int maxDepth(TreeNode root) {

        return root == null ? 0 : Math.max(maxDepth(root.left) , maxDepth(root.right)) + 1 ;

    }
}
