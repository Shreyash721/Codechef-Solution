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
 Node c=head;
 while(c!=null){
     Node next=c.next;
     c.next=prev;
     prev=c;
     c=next;
 }
 head=prev;
 
 c=head;
 int carry=1;
 
 while(c!=null && carry==1){
     if(c.data==9){
        c.data=0;
        if(c.next==null){
            c.next=new Node(1);
            carry=0;
        }
        else{
            c=c.next;
        }
     }
     else{
         c.data++;
         carry=0;
     }
 }
 prev=null;
 c=head;
 while(c!=null){
     Node next=c.next;
     c.next=prev;
     prev=c;
     c=next;
  }
  
  return prev;
}
