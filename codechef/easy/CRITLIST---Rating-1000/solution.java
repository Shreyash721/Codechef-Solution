// Node is defined as:
// class Node{
//     int val;
//     Node next;
//     Node(int x){
//     	val = x; next = null;
//     }
// }
class Solution{
    static int solve(Node root){
         if(root == null || root.next == null || root.next.next == null){
             return 0;
         }
        Node prev=root;
        Node t=root.next;
        int c=0;
        while(t.next!=null){
            if(t.val>prev.val && t.val>t.next.val){
                c++;
            }
            if(t.val<t.next.val && t.val<prev.val){
                c++;
            }
            
            prev=prev.next;
            t=t.next;
        }
        
        return c;
    }
}