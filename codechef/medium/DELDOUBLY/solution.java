/*
class Node {
    int data;
    Node next, prev;
    Node(int d) {
        data = d;
        next = prev = null;
    }
}
*/
 public static Node deleteAllOccurrences(Node head, int x ) {
     
     Node curr=head;
     while(curr!=null){
         if(curr.data==x){
             if(curr==head){
                 head=curr.next;
             }
             if(curr.prev!=null){
                 curr.prev.next=curr.next;
             }
             if(curr.next!=null){
                 curr.next.prev=curr.prev;
             }
         }
        curr=curr.next;
     }
     return head;
}
