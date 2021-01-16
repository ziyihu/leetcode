package leetcode.arraylist;

public class _203_RemoveLinkedListElements {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	 
    public ListNode removeElements(ListNode head, int val) {
        if( head == null ) return null;
        ListNode top = new ListNode(0);
        top.next = head;
        ListNode prev = top, cur = head;
        while(cur!=null) {
            if(cur.val == val) prev.next = cur.next;
            else prev = cur;
            cur = cur.next;
        }
        return top.next;
    }
}
