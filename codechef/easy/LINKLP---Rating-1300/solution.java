// Node is defined as:
// class Node{
//     int val;
//     Node next;
//     Node(){
//         val =0;
//         next = null;
//     }
//     Node(int x){
//     	val = x; next = null;
//     }
// }
class Solution{
    static int solve(Node root){
        Node slow=root;
        Node fast=root;
        int c=0;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=root;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                Node t=slow.next;
                
                c=0;
                while(t!=slow){
                    t=t.next;
                    c++;
                }
                return c+1;
            }
        }
        return -1;
    }
}
