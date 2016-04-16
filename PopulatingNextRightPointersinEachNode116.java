/**
 * Created by shubhamgoyal on 4/15/16.
 */
public class PopulatingNextRightPointersinEachNode116 {


    public void connectAuxLeft(TreeLinkNode temp , TreeLinkNode parent)
    {
        if(temp == null)
        {
            return;
        }
        temp.next = parent.right;
        connectAuxLeft(temp.left , temp);
        connectAuxRight(temp.right , temp);
    }

    public void connectAuxRight(TreeLinkNode temp , TreeLinkNode parent)
    {
        if(temp == null)
        {
            return;
        }
        if(parent.next == null)
        {
            temp.next = null;
        }
        else
        {
            temp.next = parent.next.left;
        }
        connectAuxLeft(temp.left , temp);
        connectAuxRight(temp.right , temp);
    }

    public void connect(TreeLinkNode root) {

        if(root == null)
        {
            return;
        }
        root.next = null;
        connectAuxLeft(root.left , root);
        connectAuxRight(root.right , root);


    }
}


class TreeLinkNode{
    int val;
    TreeLinkNode left, right, next;
    TreeLinkNode(int x) { val = x; }
}
