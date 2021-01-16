package leetcode.arraylist;

public class _234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode middle = middleNode(head);
        ListNode reverseNode = reverseNode(middle);
        while(head!=reverseNode) {
            if(head.val!=reverseNode.val) return false;
            head=head.next;
            reverseNode=reverseNode.next;
        }
        return true;
    }
    
    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head.next;
        while(second!=null && second.next!=null) {
            first = first.next;
            second = second.next.next;
        }
        return first;
    }
    public ListNode reverseNode(ListNode head) {
        ListNode prev = head;
        while(head!=null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
