package leetcode.arraylist;

public class _138_CopyListWithRandomPointer {
	HashMap<Node, Node> visitedHash = new HashMap<Node, Node>();
    public Node copyRandomList(Node head) {
//         if (head == null) return null;

//         if (this.visitedHash.containsKey(head)) {
//             return this.visitedHash.get(head);
//         }
//         Node node = new Node(head.val, null, null);
//         this.visitedHash.put(head, node);
//         node.next = this.copyRandomList(head.next);
//         node.random = this.copyRandomList(head.random);
//         return node;
        
        
        if (head == null) return null;

        Node ptr = head;
        while (ptr != null) {
            Node newNode = new Node(ptr.val);
            newNode.next = ptr.next;
            ptr.next = newNode;
            ptr = newNode.next;
        }
        ptr = head;
        while (ptr != null) {
            ptr.next.random = (ptr.random != null) ? ptr.random.next : null;
            ptr = ptr.next.next;
        }
        Node ptr_old_list = head; // A->B->C
        Node ptr_new_list = head.next; // A'->B'->C'
        Node head_old = head.next;
        while (ptr_old_list != null) {
            ptr_old_list.next = ptr_old_list.next.next;
            ptr_new_list.next = (ptr_new_list.next != null) ? ptr_new_list.next.next : null;
            ptr_old_list = ptr_old_list.next;
            ptr_new_list = ptr_new_list.next;
        }
        return head_old;
    }
}
