// class Node {
//     int data;
//     Node next;
//     Node(int val) {
//         data = val;
//         next = null;
//     }
// }

static Node deleteMiddle(Node head) {
    if(head==null || head.next==null) return null;
    Node t=head;
    int n=0;
    while(t.next!=null){
        t=t.next;
        n++;
    }
    int mid=n/2;
    t=head;
    for(int i=0;i<mid-1;i++){
        t=t.next;
    }
    t.next=t.next.next;
    
    return head;
    
}
