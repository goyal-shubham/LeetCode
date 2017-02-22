package List;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class ListNode {


        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public void printList() {

            ListNode temp = this;
            while(temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }

}
