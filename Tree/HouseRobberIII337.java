package Tree;

/**
 * Created by shubham.goyal on 2/19/17.
 */
public class HouseRobberIII337 {

    public int rob(TreeNode root) {

        if(root == null) {
            return 0;
        }

        if(root.left == null && root.right == null) {
            return root.val;
        }

        int leftSum = 0, rightSum = 0;
        int leftLeftSum = 0, rightRightSum = 0;
        if(root.left != null) {
            leftSum = rob(root.left);
            leftLeftSum = rob(root.left.left) + rob(root.left.right);
        }

        if(root.right != null) {
            rightSum = rob(root.right);
            rightRightSum = rob(root.right.right) + rob(root.right.left);
        }

        return Math.max(leftSum + rightSum, leftLeftSum + rightRightSum + root.val);


    }

    //Optimal Solution via Discussion Forums.

    public int rob1(TreeNode root) {
        int[] res = robSub(root);
        return Math.max(res[0], res[1]);
    }

    private int[] robSub(TreeNode root) {
        if (root == null) return new int[2];

        int[] left = robSub(root.left);
        int[] right = robSub(root.right);
        int[] res = new int[2];

        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        res[1] = root.val + left[0] + right[0];

        return res;
    }

    public static void main(String[] args) {
        TreeNode Node = new TreeNode(3);
        TreeNode Node1 = new TreeNode(1);
        TreeNode Node2 = new TreeNode(2);
        TreeNode Node3 = new TreeNode(3);
        TreeNode Node4 = new TreeNode(3);

        Node.left = Node2;
        Node.right = Node3;

        Node2.right = Node4;
        Node3.right = Node1;

        HouseRobberIII337 obj = new HouseRobberIII337();
        obj.rob(Node);
    }
}
