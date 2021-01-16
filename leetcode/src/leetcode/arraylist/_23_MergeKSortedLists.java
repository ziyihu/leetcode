package leetcode.arraylist;

public class _23_MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length ==0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, (a,b)->{ return a.val-b.val; });
        for(int i = 0; i < lists.length;i++) {
            if(lists[i]!=null) queue.offer(lists[i]);
        }
        ListNode top = new ListNode(0);
        ListNode cur = top;
        while(!queue.isEmpty()) {
            ListNode min = queue.poll();
            cur.next = min;
            cur = cur.next;
            if(min.next!=null) {
                queue.offer(min.next);
            }
        }
        return top.next;
    }
}
