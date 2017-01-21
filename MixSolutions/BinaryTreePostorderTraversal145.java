package MixSolutions;

import java.util.*;

/**
 * Created by shubhamgoyal on 3/31/16.
 * Given a binary tree, return the postorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
 \
 2
 /
 3
 return [3,2,1].

 Note: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreePostorderTraversal145
{

    public List<Integer> postorderTraversal(TreeNode root)
    {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if( root == null)
        {
            return list;
        }
        Set<TreeNode> visit = new HashSet<TreeNode>();

        while(true)
        {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            if(stack.isEmpty())
            {
                return list;
            }
            root = stack.peek().right;
            if(root == null || visit.contains(root))
            {
                root = stack.pop();
                list.add(root.val);
                visit.add(root);
                root = null;
            }

        }

    }

}

