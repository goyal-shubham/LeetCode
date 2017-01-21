package MixSolutions;

import java.util.HashMap;

/**
 * Created by shubhamgoyal on 3/30/16.
 *
 * Given preorder and inorder traversal of a tree, construct the binary tree.

 Note:
 You may assume that duplicates do not exist in the tree.
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal105 {


    HashMap<Integer, Integer> myMap = null;

    public TreeNode buildTree(int[] preorder, int[] inorder)
    {
        myMap = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < inorder.length; i++)
        {
            myMap.put(inorder[i], i);
        }

        return buildTree(preorder, inorder, 0 , inorder.length - 1, 0 ,  inorder.length -1);

    }


    private TreeNode buildTree(int[] preorder, int[] inorder, int startP, int endP, int startI, int endI)
    {
        if(preorder == null || inorder == null || startP > endP || startI > endI)
        {
            return null;
        }
        TreeNode root = new TreeNode(0);
        root.val = preorder[startP];
        int index = myMap.get(root.val);
        root.left = buildTree( preorder, inorder, startP + 1, startP + index - startI, startI, index - 1);
        root.right = buildTree( preorder, inorder, endP - endI + index + 1, endP , index + 1 , endI);

        return root;

    }


}
