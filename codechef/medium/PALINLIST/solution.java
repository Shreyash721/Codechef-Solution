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
    ArrayList<Integer> arr=new ArrayList<>();
    Node curr=head;
    
    while(curr!=null){
        arr.add(curr.val);
        curr=curr.next;
    }
    
    
    int i=0;
    int j=arr.size()-1;
    
    while(i<=j){
        if(arr.get(i)!=arr.get(j)){
            return false;
        }
        i++;
        j--;
    }
    
    return true;
 }
}
    
