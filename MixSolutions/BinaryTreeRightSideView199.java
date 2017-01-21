package MixSolutions;

import java.util.*;

/**
 * Created by shubhamgoyal on 4/15/16.
 */
public class BinaryTreeRightSideView199 {

    List<Integer> result;
    public void getRightSideView(List<TreeNode> queue)
    {
        int size = queue.size();
        if(size == 0)
        {
            return;
        }

        List<TreeNode> queue1 = new LinkedList<>();
        result.add(queue.get(size - 1).val);
        for(TreeNode t : queue)
        {
            if(t.left != null)
            {
                queue1.add(t.left);
            }
            if(t.right != null)
            {
                queue1.add(t.right);
            }
        }
        getRightSideView(queue1);

    }

    public List<Integer> rightSideView(TreeNode root) {

        result = new ArrayList<>();
        List<TreeNode> queue = new LinkedList<>();

        if(root != null)
        {
            queue.add(root);
        }

        getRightSideView(queue);
        return result;

    }
}
