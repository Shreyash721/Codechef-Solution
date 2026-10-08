 class Solution {
    Node removeDuplicates(Node head) {
        Node t=head;
        
        while(t!=null && t.next!=null){
            if(t.data==t.next.data){
                t.next=t.next.next;
            }
            else{
                t=t.next;
            }
        }
        return head;
    }
 }