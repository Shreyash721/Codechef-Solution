/*class Node{
    int val;
    Node next;
    Node(int x){
    	val = x; next = null;
    }
}*/

static Node reverseSegment(Node head, int L, int R) {
    if (head == null || L == R) {
        return head;
    }

    Node dummy = new Node(0);
    dummy.next = head;

    Node prev = dummy;

    // Move to the node just before position L
    for (int i = 1; i < L; i++) {
        prev = prev.next;
    }

    Node curr = prev.next;

    // Reverse the segment using head insertion
    for (int i = 0; i < R - L; i++) {
        Node nextNode = curr.next;
        curr.next = nextNode.next;
        nextNode.next = prev.next;
        prev.next = nextNode;
    }

    return dummy.next;
}