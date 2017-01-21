package MixSolutions;

/**
 * Created by shubhamgoyal on 4/15/16.
 */
public class CountCompleteTreeNodes222 {

    public int countNodes(TreeNode root) {

        if(root == null)
        {
            return 0;
        }
        int left = 0;
        int right = 0;
        TreeNode temp = root;
        while(temp != null)
        {
            temp = temp.left;
            left++;
        }
        temp = root;
        while(temp != null)
        {
            temp = temp.right;
            right++;
        }
        if(left == right)
        {
            return (2 << (left - 1)) - 1; //(int) Math.pow(2 , left ) - 1;
        }
        else
        {
            return  countNodes(root.left) + countNodes(root.right) + 1;
        }

    }
}
