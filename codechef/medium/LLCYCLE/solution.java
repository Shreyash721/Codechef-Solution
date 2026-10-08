// class Node {
//     int val;
//     Node next;
//     Node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }



public static int detectCycle(Node head) {
   Node slow=head;
   Node fast=head;
   int c=0;
   while(slow!=null && fast!=null && fast.next!=null){
       slow=slow.next;
       fast=fast.next.next;
       if(slow==fast){
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
