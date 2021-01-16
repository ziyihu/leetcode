package leetcode.arraylist;

public class _83_RemoveDuplicatesFromSortedList {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode top = head;
        while(head !=null && head.next != null) {
            if(head.val == head.next.val) {
                head.next = head.next.next;
            } else head = head.next;
        }
        return top;
    }
}
