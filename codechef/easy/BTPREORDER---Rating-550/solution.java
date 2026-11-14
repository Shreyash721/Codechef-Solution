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
    private static void ord(Node root,ArrayList<Integer> arr){
        if(root==null) return;
        arr.add(root.val);
        ord(root.left,arr);
        ord(root.right,arr);
    }
    public void preOrderTraversal(Node root) {
        if(root==null) return;
        ArrayList<Integer> arr=new ArrayList<>();
        ord(root,arr);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
