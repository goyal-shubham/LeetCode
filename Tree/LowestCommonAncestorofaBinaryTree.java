package Tree;

/**
 * Created by shubham.goyal on 2/2/17.
 */
public class LowestCommonAncestorofaBinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null || root == p || root == q) {
            return root;
        }


        TreeNode leftCommonAncestor = lowestCommonAncestor(root.left, p , q);
        TreeNode rightCommonAncesor = lowestCommonAncestor(root.right,p , q);

        if(leftCommonAncestor == null) {
            return rightCommonAncesor;
        } else if(rightCommonAncesor == null) {
            return leftCommonAncestor;
        }
        return root;

    }
}
