package MixSolutions;

import java.util.HashMap;

/**
 * Created by shubhamgoyal on 3/30/16.
 *
 * Given inorder and postorder traversal of a tree, construct the binary tree.

 Note:
 You may assume that duplicates do not exist in the tree.
 */
public class ConstructBinaryTreefromPostorderandInorderTraversal106 {


    public class Solution {

        HashMap<Integer, Integer> myMap = null;

        public TreeNode buildTree(int[] inorder, int[] postorder)
        {
            myMap = new HashMap<Integer, Integer>();
            for(int i = 0 ; i < inorder.length; i++)
            {
                myMap.put(inorder[i], i);
            }

            return buildTree(postorder, inorder, 0 , inorder.length - 1, 0 ,  inorder.length -1);

        }


        private TreeNode buildTree(int[] postorder, int[] inorder, int startP, int endP, int startI, int endI)
        {
            if(startP > endP || startI > endI)
            {
                return null;
            }

            TreeNode root = new TreeNode(0);
            root.val = postorder[endP];
            int index = myMap.get(root.val);

            root.left = buildTree( postorder, inorder, startP,  startP - startI + index - 1 ,  startI, index - 1);
            root.right = buildTree( postorder, inorder, startP - startI + index , endP - 1 ,index + 1 , endI);

            return root;

        }

    }

}
