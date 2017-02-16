package Tree;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by shubham.goyal on 2/7/17.
 */
public class PathSumII113 {

    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null) {
            return result;
        }
        LinkedList<Integer> current = new LinkedList<>();
        pathSum(root, sum , current);
        return result;
    }

    public void pathSum(TreeNode root, int sum, List<Integer> current) {
        if(root.left == null && root.right == null && root.val == sum) {
            current.add(root.val);
            result.add(current);
            return;
        }

        current.add(root.val);
        if(root.left != null) {
            pathSum(root.left, sum - root.val, new LinkedList<>(current));
        }
        if(root.right != null) {
            pathSum(root.right, sum - root.val, new LinkedList<>(current));
        }

    }
}
