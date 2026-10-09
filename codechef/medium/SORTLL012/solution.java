/* Node structure
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/
public static Node sortList(Node head) {
    Node d0=new Node(-1);
    Node d1=new Node(-2);
    Node d2=new Node(-3);
    
    Node t=head;
    Node t0=d0;
    Node t1=d1;
    Node t2=d2;
    
    while(t!=null){
        Node next=t.next;
        t.next=null;
        if(t.data==0){
            t0.next=t;
            t0=t;
        }
        else if(t.data==1){
            t1.next=t;
            t1=t;
        }
        else{
            t2.next=t;
            t2=t;
        }
        t=next;
    }
    t1.next=d2.next;
    t0.next=d1.next;
    
    
    return d0.next;
}
