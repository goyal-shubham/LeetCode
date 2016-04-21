import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Created by shubhamgoyal on 4/20/16.
 */
public class MergekSortedLists23 {

    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length == 0)
        {
            return null;
        }
        int len = lists.length;
        HashMap<ListNode, Integer> map = new HashMap<>();
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a,b)->a.val - b.val );
        for(int i = 0; i < len; i++){
            ListNode current = lists[i];
            if(current == null) continue;
            queue.offer(current);
            map.put(current, i);
        }

        ListNode head = null, cur = null, nextInput = null, pre = null;


    }
}
