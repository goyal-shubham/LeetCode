package List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by shubham.goyal on 2/16/17.
 */
public class MergeKSortedLists23 {



    public ListNode mergeKLists(ListNode[] lists) {

        int min = Integer.MAX_VALUE;
        int index = lists.length;
        for(int i = 0; i < lists.length; i++) {

            ListNode node = lists[i];
            if(node != null && min > node.val) {
                index = i;
                min = node.val;
            }
        }

        if(index == lists.length) {
            return null;
        }

        ListNode result = lists[index];
        lists[index] = lists[index].next;
        result.next = mergeKLists(lists);

        return result;
    }


    public ListNode mergeKListsOtherSolution(ListNode[] lists) {

        if(lists.length == 0) {
            return null;
        }

        return partition(lists, 0, lists.length - 1);
    }

    public ListNode partition(ListNode[] lists, int start, int end) {

        if(start == end) {
            return lists[start];
        }

        int mid = (start + (end - start) / 2 );
        ListNode l1 = partition(lists, start, mid);
        ListNode l2 = partition(lists, mid + 1, end);

        return merge(l1, l2);

    }

    public ListNode merge(ListNode l1, ListNode l2) {

        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        if(l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        }
        else {
            l2.next = merge(l1, l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        MergeKSortedLists23 obj = new MergeKSortedLists23();

        ListNode[] input = new ListNode[2];
        ListNode l1 = new ListNode(0);
        ListNode temp = l1;
        for(int i = 1; i < 5; i++) {
            temp.next = new ListNode(i*4);
            temp = temp.next;
        }

        ListNode l2 = new ListNode(1);
        temp = l2;
        for(int i = 1; i < 5; i++) {
            temp.next = new ListNode(i*7);
            temp = temp.next;
        }

        l1.printList();
        System.out.println();
        l2.printList();

        input[0] = l1;
        input[1] = l2;
        ListNode newList = obj.mergeKLists(input);
        newList.printList();
    }
}
