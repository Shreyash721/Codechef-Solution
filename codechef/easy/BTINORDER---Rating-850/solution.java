// class Node {
//     int val;
//     Node left;
//     Node right;

//     Node(int val) {
//         this.val = val;
//         this.left = null;
//         this.right = null;
//     }
// }

class Solution {
    public void inOrderTraversal(Node root) {
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
       inOrderTraversal(root.right);
        
    }
}
