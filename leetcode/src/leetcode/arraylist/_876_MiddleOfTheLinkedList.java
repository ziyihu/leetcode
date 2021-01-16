package leetcode.arraylist;

public class _876_MiddleOfTheLinkedList {
	  public class ListNode {
		     int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
    public ListNode middleNode(ListNode head) {
        ListNode first = new ListNode();
        ListNode second = new ListNode();
        first = head;
        second = head;
        while(second!=null && second.next!=null) {
            first = first.next;
            second = second.next.next;
        }
        return first;
    }
}
