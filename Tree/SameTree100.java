package Tree;

/**
 * Created by shubham.goyal on 2/3/17.
 */
public class SameTree100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null) {
            return true;
        }
        else if(p == null || q == null) {
            return false;
        }

        if(p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;

    }
}
