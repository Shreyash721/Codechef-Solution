// /*class Node{
//     int val;
//     Node next;
//     Node(int x){
//     	val = x; next = null;
//     }
// }*/

// static int getMiddleElement(Node head){
//     Node temp=head;
//     int c=0;
//     if(head==null) return 0;
    
//     while(head!=null){
//         c++;
//         temp=temp.next;
//     }
    
//     int mid=c/2;
//     temp=head;
//     while(mid>0){
//         temp=temp.next;
//     }
    
//     return temp.val;
// }


static int getMiddleElement(Node head) {
    if (head == null) return 0;

    int c = 0;
    Node temp = head;

    while (temp != null) {
        c++;
        temp = temp.next;
    }

    int mid = c / 2;
    temp = head;

    while (mid > 0) {
        temp = temp.next;
        mid--;
    }

    return temp.val;
}