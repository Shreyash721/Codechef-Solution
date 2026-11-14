// class Node {
//     int val;
//     Node left, right;

//     Node(int val) {
//         this.val = val;
//         this.left = this.right = null;
//     }
// }
class Solution {
    public int minDepth(Node root) {
        if(root==null) return 0;
        int l=1+minDepth(root.left);
        int r=1+minDepth(root.right);
        return Math.min(r,l);
    }
}