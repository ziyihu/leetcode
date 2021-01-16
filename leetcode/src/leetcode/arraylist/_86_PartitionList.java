package leetcode.arraylist;

public class _86_PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode leftStart = new ListNode(0);
        ListNode leftEnd = leftStart;
        ListNode rightStart = new ListNode(0);
        ListNode rightEnd = rightStart;
        while(head != null) {
            if(head.val < x) {
                leftEnd.next = head;
                leftEnd = leftEnd.next;
            } else {
                rightEnd.next = head;
                rightEnd = rightEnd.next;
            }
            head = head.next;
        }
        rightEnd.next = null;
        leftEnd.next = rightStart.next;
        return leftStart.next;	
    }
}
