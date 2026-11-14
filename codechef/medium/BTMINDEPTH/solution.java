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
        if(root == null) return 0;

        int l = minDepth(root.left);
        int r = minDepth(root.right);

        if(root.left == null) return 1 + r;
        if(root.right == null) return 1 + l;

        return 1 + Math.min(l, r);
    }
}
