package MixSolutions;

/**
 * Created by shubhamgoyal on 3/30/16.
 * Given a binary tree, determine if it is height-balanced.
    For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */


public class BalancedBinaryTree110 {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

        public boolean isBalanced(TreeNode root) {

            return maxDepth(root) != -1;
        }


        public int maxDepth(TreeNode root) {
            if(root == null)
            {
                return 0;
            }
            int d1 = maxDepth(root.left);
            int d2 = maxDepth(root.right);

            if( d1 == -1 || d2 == -1 || Math.abs(d1 - d2) > 1)
            {
                return -1;
            }

            return Math.max(d1, d2) + 1;

        }
    }



