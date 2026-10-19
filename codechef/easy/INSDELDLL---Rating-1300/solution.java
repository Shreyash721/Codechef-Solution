/*class Node{
    int val;
    Node next;
    Node prev;
    Node(int x){
    	val = x; 
    	next = null;
    	prev = null;
    }
}*/

static Node insertNode(Node head, int position, int value) {
    Node newNode = new Node(value);

    // Insert at the beginning
    if (position == 1) {
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }

    Node curr = head;

    // Move to the node before the insertion position
    for (int i = 1; i < position - 1; i++) {
        curr = curr.next;
    }

    newNode.next = curr.next;
    newNode.prev = curr;

    if (curr.next != null) {
        curr.next.prev = newNode;
    }

    curr.next = newNode;

    return head;
}

static Node deleteNode(Node head, int position) {

    // Delete the first node
    if (position == 1) {
        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        return head;
    }

    Node curr = head;

    // Move to the node to be deleted
    for (int i = 1; i < position; i++) {
        curr = curr.next;
    }

    // Update previous node's next pointer
    curr.prev.next = curr.next;

    // Update next node's previous pointer
    if (curr.next != null) {
        curr.next.prev = curr.prev;
    }

    return head;
}