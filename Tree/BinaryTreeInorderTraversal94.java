package Tree;

import java.util.*;

/**
 * Created by shubham.goyal on 2/2/17.
 */
public class BinaryTreeInorderTraversal94 {

    public List<Integer> inOrderTraversal (TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null) {

            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            }
            else {
                TreeNode current = stack.pop();
                result.add(current.val);
                temp = current.right;
            }

        }

        return result;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while(!stack.isEmpty() || p != null) {
            if(p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode node = stack.pop();
                result.add(node.val);  // Add after all left children
                p = node.right;
            }
        }
        return result;
    }
}
