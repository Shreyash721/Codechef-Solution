// class Node {
//    int data;
//    Node next;
//    Node prev;
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//        this.prev = null;
//    }
//}
    public static void findPairs(Node head, int target, StringBuilder sb) {
        Node right=head;
        Node left=head;
        boolean found=false;
        
        while(right!=null && right.next!=null){
            right=right.next; 
        }
        
        while(left!=null && right!=null && left.data<right.data){
            
            int sum=left.data+right.data;
            
            if(sum==target){
                if(found) sb.append(" ");
                sb.append('[').append(left.data).append(',').append(right.data).append(']');
                found=true;
                left=left.next;
                right=right.prev;
            }
            
            else if(sum<target) left=left.next;
            else right=right.prev;
        }
        
        if (!found) sb.append("[]");
        
        
    }
