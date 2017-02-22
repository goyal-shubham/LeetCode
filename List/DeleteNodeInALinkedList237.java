package List;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class DeleteNodeInALinkedList237 {

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;

    }
}
