package List;

/**
 * Created by shubham.goyal on 2/15/17.
 */
public class CopyListwithRandomPointer138 {

    public RandomListNode copyRandomList(RandomListNode head) {

        if(head == null) {
            return head;
        }

        RandomListNode temp = head;
        while(temp != null) {
            RandomListNode tempNext = temp.next;
            temp.next = new RandomListNode(temp.label);
            temp.next.next = tempNext;
        }

        temp = head;
        while(temp != null && temp.random != null) {
            temp.next.random = temp.random.next;
            temp = temp.next.next;
        }

        temp = head;
        RandomListNode newHead = head.next;

        RandomListNode temp1 = newHead;

        while(temp != null && temp.next != null && temp1.next != null) {
            temp.next = temp.next.next;
            temp1.next = temp1.next.next;
        }

        return newHead;
    }

    class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }
}
