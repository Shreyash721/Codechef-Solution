// import java.util.*;
// import java.io.*;

// class Node {
//     int val;
//     Node left, right;

//     Node(int val) {
//         this.val = val;
//         this.left = this.right = null;
//     }
// }
class Solution {
     private void flatten(Node root,ArrayList<Integer> arr){
       if(root==null) return;
       flatten(root.left,arr);
       arr.add(root.val);
       flatten(root.right,arr);
    }
    public int getPredecessor(Node root, int x) {
        ArrayList<Integer> arr=new ArrayList<>();
        flatten(root,arr);
        int a=arr.indexOf(x);
        return arr.get(a-1);
    }
}
