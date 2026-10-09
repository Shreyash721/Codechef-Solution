/*
public class Main {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }*/
public static Node listReverse(Node head) {
    if(head==null || head.next==null) return head;
    Node t=head;
    Node p=null;
    Node c=head;
    while(c!=null){
        Node next=c.next;
        c.next=p;
        p=c;
        c=next;
    }
    
    return p;
    
}

    

