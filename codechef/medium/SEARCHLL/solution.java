// class Node {
//     int data;
//     Node next;

//     Node(int val) {
//         data = val;
//         next = null;
//     }
// }


static Node removeKey(Node head, int key) {
    Node dummy=new Node(-1);
    Node tr=dummy;
    while(head!=null){
        if(head.data==key) head=head.next;
        else{
            tr.next=head;
            tr=tr.next;
            head=head.next;
        }
    }
    if(tr!=dummy){
        return dummy.next;
    }
    else{
        return null;
    }
}
