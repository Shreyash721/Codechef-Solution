// class Node {
//     int data;
//     Node next;
//     Node(int val) {
//         data = val;
//         next = null;
//     }
// }

static Node deleteMiddle(Node head) {
    if(head==null || head.next==null) return head;
    Node t=head;
    int n=1;
    while(t.next!=null){
        t=t.next;
        n++;
    }
    int mid=n/2-1;
    t=head;
    while(mid-->1){
        t=t.next;
    }
    t.next=t.next.next;
    
    return head;
    
}
