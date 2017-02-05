package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by shubham.goyal on 2/3/17.
 */
public class BinaryTreeLevelOrderTraversal102 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new LinkedList<>();

        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {

            int count = queue.size();
            List<Integer> current = new LinkedList<>();
            for(int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
                current.add(node.val);

            }

            result.add(current);
        }

        return result;
    }
}
