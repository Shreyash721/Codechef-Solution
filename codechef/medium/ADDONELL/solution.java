// class Node {
//     int data;
//     Node next;
//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }


public static Node addOne(Node head) {
 Node prev=null;
 Node curr=head;
 while(curr!=null){
     Node next=curr.next;
     curr.next=prev;
     prev=curr;
     curr=next;
 }
 head=prev;
 
 curr=head;
 int carry=1;
 while(curr!=null && carry==1){
     if(curr.data==9){
         curr.data=0;
         if(curr.next==null){
             curr.next=new Node(1);
             carry=0;
         }
         else{
             curr=curr.next;
         }
     }
     else{
         curr.data++;
         carry=0;
     }
 }
 
 curr=head;
 prev=null;
 
 while(curr!=null){
     Node next=curr.next;
     curr.next=prev;
     prev=curr;
     curr=next;
 }
 
 
 return prev;
}
