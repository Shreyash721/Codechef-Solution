/*class Node {
    public int val;
    public Node next;
    public Node child;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.child = null;
    }
} */

 /*
public static Node flatten(Node head) {
    ArrayList < Integer > arr = new ArrayList < > ();
    Node t = head;

    while (t != null) {
        Node d = t;
        while (d != null) {
            arr.add(d.val);
            d = d.child;
        }
        t = t.next;
    }

    Collections.sort(arr);
    Node dummy = new Node(-1);
    Node temp = dummy;

    for (int x: arr) {
        Node node = new Node(x);
        temp.child = node;
        temp = temp.child;

    }

    return dummy.child;
}
 */
 
 
public static Node flatten(Node root) {
    if(root==null) return root;
    Node next=root.next;
    Node child=root.child;
    root.child=null;
    root.next=flatten(child);
    
    Node t=root;
    while(t.next!=null){
        t=t.next;
    }
    t.next=flatten(next);
    
    return root;
}
 
 
