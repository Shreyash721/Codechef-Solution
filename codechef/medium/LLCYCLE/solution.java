// class Node {
//     int val;
//     Node next;
//     Node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }



public static int detectCycle(Node head) {
   if(head==null || head.next==null) return -1;
   Node slow=head;
   Node fast=head;
   int c=-1;
   while(slow!=null && fast!=null && fast.next!=null){
       slow=slow.next;
       fast=fast.next.next;
       if(slow==fast){
           c=0;
           slow=head;
           while(slow!=fast){
               slow=slow.next;
               fast=fast.next;
               c++;
           }
           
           break;
       }
   }
   
    return c;
}
