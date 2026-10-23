// import java.util.*;

// class Node {
//     int val;
//     Node left, right;

//     Node(int val) {
//         this.val = val;
//         left = right = null;
//     }
// }

class Solution {
    private void flatten(Node root,ArrayList<Integer> arr){
        
        if(root!=null) flatten(root.left,arr);
        if(root!=null) arr.add(root.val);
        if(root!=null) flatten(root.right,arr);
    }
    public int kthLargestNode(Node root, int k) {
        ArrayList<Integer> arr=new java.util.ArrayList<>();
        flatten(root,arr);
        int d=arr.size()-k;
        
        return arr.get(d);
        
    }
}
