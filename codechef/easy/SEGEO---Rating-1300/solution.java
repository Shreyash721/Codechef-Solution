class Solution {
    public Node rearrange(Node head) {
        
        if(head==null || head.next==null) return head;
        Node odddummy=new Node(-1);
        Node evendummy=new Node(-2);
        
        Node odd=odddummy;
        Node even=evendummy;
        Node t=head;
        
        while(t!=null){
            Node next=t.next;
            t.next=null;
            
            if(t.val%2==0){
                even.next=t;
                even=t;
            }
            else{
                odd.next=t;
                odd=t;
            }
            t=next;
        }
        even.next=odddummy.next;
        
        return evendummy.next;
    }
}

