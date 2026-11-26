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
       if(root==null) return;
       flatten(root.left,arr);
       arr.add(root.val);
       flatten(root.right,arr);
    }
    public int kthLargestNode(Node root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        flatten(root,arr);
        int m=arr.size()-k;
        return arr.get(m);
    }
}
