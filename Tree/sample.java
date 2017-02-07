package Tree;

/**
 * Created by shubham.goyal on 2/7/17.
 */
public class sample {


    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        return buildTree(preorder, inorder, 0, 0, inorder.length - 1);
    }


    public static TreeNode buildTree(int[] preorder, int[] inorder, int start1, int start2, int end2) {

        if (start2 > end2 || start1 > preorder.length - 1) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[start1]);
        int i = 0;
        for (i = start2; i <= end2; i++) {
            if (inorder[i] == preorder[start1]) {
                break;
            }
        }

        root.left = buildTree(preorder, inorder, start1 + 1, start2, i - 1);
        root.right = buildTree(preorder, inorder, start1 + i - start2 + 1, i + 1, end2);

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int[] postorder = new int[] {1,3,2,5,7,6,4};
        int[] preorder = new int[]{4,2,1,3,6,5,7};
        int[] inorder = new int[]{1,2,3,4,5,6,7};
        buildTree(preorder, inorder);

    }
}
