import java.util.*;

/**
 * Created by shubhamgoyal on 4/15/16.
 */
public class BinaryTreePreorderTraversal144 {



    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> myStack = new Stack<>();
        if(root == null)
        {
            return result;
        }
        myStack.add(root);
        Set<TreeNode> visit = new HashSet<>();
        while(true)
        {



            result.add(root.val);
            root = root.left;
            while(root == null)
            {
                if(myStack.isEmpty())
                {
                    return result;
                }
                root = myStack.pop().right;
            }

            myStack.add(root);


        }

    }
}
