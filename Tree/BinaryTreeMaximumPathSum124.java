package Tree;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class BinaryTreeMaximumPathSum124 {

    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if(root == null) {
            return max;
        }

        int sums = maxPathSumAux(root);
        // int max = Integer.MIN_VALUE;
        // for(int i : sums){
        //     System.out.println(i);
        //     if(i > max){
        //         max = i;
        //     }
        // }

        return max;

    }

    public int maxPathSumAux(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftSums = maxPathSumAux(root.left);
        int rightSums = maxPathSumAux(root.right);

        // if(leftSums == null && rightSums == null){
        //     Set<Integer> result = new HashSet<Integer>();
        //     result.add(root.val);
        //     return result;
        // }

        int result = Math.max(root.val, Math.max(root.val + leftSums, root.val + rightSums));
        max = Math.max(max, result );

        int max2 = leftSums + root.val + rightSums;
        max = Math.max(max, max2 );
        return result;
    }
}
