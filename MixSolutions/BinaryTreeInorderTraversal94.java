package MixSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * Created by shubhamgoyal on 3/30/16.
 *
 * Given a binary tree, return the inorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
 \
 2
 /
 3
 return [1,3,2].

 Note: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreeInorderTraversal94 {


    //recursive 1
    public List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> treeTraverse = new ArrayList<>();
        if( root == null)
        {
            return treeTraverse;
        }

        List<Integer> leftList = inorderTraversal(root.left);
        treeTraverse.addAll(leftList);
        treeTraverse.add(root.val);
        List<Integer> rightList = inorderTraversal(root.right);
        treeTraverse.addAll(rightList);

        return treeTraverse;
    }

    //recursive 2
    public List<Integer> inorderTraversal2(TreeNode root)
    {
        List<Integer> treeTraverse = new ArrayList<>();
        if( root == null)
        {
            return treeTraverse;
        }

        inorder(root.left, treeTraverse);
        treeTraverse.add(root.val);
        inorder(root.right, treeTraverse);


        return treeTraverse;
    }


    public void inorder(TreeNode root, List<Integer> list)
    {

        if( root == null)
        {
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    //Iterative Solution
    public List<Integer> inorderTraversalIterative(TreeNode root)
    {

        List<Integer> treeData = new ArrayList<>();
        Stack<TreeNode> myStack = new Stack<>();

        if( root == null)
        {
            return treeData;
        }

        while( root != null)
        {
            myStack.push(root);
            root = root.left;
            while( root == null)
            {
                if(myStack.empty())
                {
                    return treeData;
                }
                root = myStack.pop();

                treeData.add(root.val);
                root = root.right;
            }
        }
        return treeData;
    }
}
