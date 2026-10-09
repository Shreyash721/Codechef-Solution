/*class Node{
    int val;
    Node next;
    Node(int x){
    	val = x; next = null;
    }
}*/

static Node rotateRight(Node head, int r){
    if(head==null || head.next==null || r==0) return head;
    Node t=head;
    int n=1;
    while(t.next!=null){
        t=t.next;
        n++;
    }
    
    r=r%n;
    if(r==0) return head;
    t.next=head;
    
    int steps=n-r;
    Node new1=head;
    while(steps-->1){
        new1=new1.next;
    }
    Node newhead=new1.next;
    new1.next=null;
    
    
    return newhead;
}