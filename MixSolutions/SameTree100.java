package MixSolutions;

/**
 * Created by shubhamgoyal on 4/1/16.
 */
public class SameTree100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
        {
            return true;
        }

        if(p == null || q == null)
        {
            return false;
        }

        if(p.val == q.val)
        {
            if(isSameTree(p.left, q.left))
            {
                return isSameTree(p.right, q.right);
            }
        }

        return false;

    }
}
