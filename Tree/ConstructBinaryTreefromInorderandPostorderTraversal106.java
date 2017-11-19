package Tree;

/**
 * Created by shubham.goyal on 2/7/17.
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal106 {

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, postorder, 0, inorder.length - 1, postorder.length - 1);
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder, int startIn, int endIn, int endPost) {
        if(endPost < 0 || startIn > endIn) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[endPost]);
        int i = 0;
        for (i = startIn; i <= endIn; i++) {
            if (inorder[i] == postorder[endPost]) {
                break;
            }
        }

        root.left = buildTree(inorder, postorder, startIn, i - 1, endPost - endIn + i - 1);
        root.right = buildTree(inorder, postorder, i + 1, endIn, endPost - 1);

        return root;
    }

    public static void main(String[] args) {
        int[] postorder = new int[] {4,5,2,6,7,3,1};
        int[] inorder = new int[]{4,2,5,1,6,3,7};
        TreeNode root = buildTree(inorder, postorder);
        System.out.println(root.left);
    }

}
