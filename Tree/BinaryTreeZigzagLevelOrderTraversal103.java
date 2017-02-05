package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by shubham.goyal on 2/3/17.
 */
public class BinaryTreeZigzagLevelOrderTraversal103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new LinkedList<>();
        if(root == null){
            return result;
        }

        boolean order = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {

            List<Integer> currentLevel = new LinkedList<>();
            int count = queue.size();
            for(int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                if(order) {
                    currentLevel.add(node.val);
                } else {
                    currentLevel.add(0,node.val);
                }
            }

            order = order ? false : true;
            result.add(currentLevel);

        }

        return result;
    }
}
