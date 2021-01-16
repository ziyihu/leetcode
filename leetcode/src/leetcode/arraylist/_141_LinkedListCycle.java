package leetcode.arraylist;

public class _141_LinkedListCycle {
	  public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
    public boolean hasCycle(ListNode head) {
        if(head ==null || head.next ==null) return false;
        ListNode first = new ListNode();
        ListNode second = new ListNode();
        first = head;
        second = head.next;
        while(first!=second) {
            if(second==null || second.next==null) return false;
            first = first.next;
            second = second.next.next;
        }
        return true;
    }
}
