package leetcode.arraylist;

public class _24_SwapNodesInPairs {
	   public ListNode swapPairs(ListNode head) {
	        if(head==null ||head.next==null) return head;
	        ListNode dummy = new ListNode(-1);
	        dummy.next = head;
	        ListNode prevNode = dummy;


	        while(head!=null&&head.next!=null) {
	            // Nodes to be swapped
	            ListNode firstNode = head;
	            ListNode secondNode = head.next;

	            // Swapping
	            prevNode.next = secondNode;
	            firstNode.next = secondNode.next;
	            secondNode.next = firstNode;

	            // Reinitializing the head and prevNode for next swap
	            prevNode = firstNode;
	            head = firstNode.next; // jump
	        }
	        return dummy.next;
	    }
}
