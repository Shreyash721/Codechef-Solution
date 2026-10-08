// Node structure used:
// class Node {
//     int val;
//     Node next;
//     Node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }
class Solution {
public boolean isPalindrome(Node head) {
    Node tail=head;
    Node node=null;
    while(tail!=null){
        Node n=new Node(tail.val);
        n.next=node;
        node=n;
        tail=tail.next;
    }
    
    while(head!=null && node!=null){
        if(head.val!=node.val) return false;
        head=head.next;
        node=node.next;
    }
    return true;
}
}
    
