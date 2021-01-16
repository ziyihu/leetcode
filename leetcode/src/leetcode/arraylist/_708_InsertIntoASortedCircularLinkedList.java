package leetcode.arraylist;

public class _708_InsertIntoASortedCircularLinkedList {
    public Node insert(Node head, int insertVal) {
        if(head==null) {
            Node in = new Node(insertVal);
            in.next = in;
            return in;
        }
        Node top = head;
        while(head.next!=top) {
            if(head.val<=insertVal&&head.next.val>=insertVal) break;
            if(head.val>insertVal&&head.next.val>insertVal&&head.val>head.next.val) break;
            if(head.val<insertVal&&head.next.val<insertVal&&head.val>head.next.val) break;
            head = head.next;
        }
        Node newNode = new Node(insertVal);
        Node temp = head.next;
        head.next = newNode;
        newNode.next = temp;
        return top;
    }
}
