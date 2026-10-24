// import java.util.*;

// class Node {
//     int val;
//     Node left, right;

//     Node(int val) {
//         this.val = val;
//         this.left = this.right = null;
//     }
// }
class Solution {
    public Node lcaInBST(Node root, int p, int q) {
        if (root == null) return null;

        if (p < root.val && q < root.val)
            return lcaInBST(root.left, p, q);

        if (p > root.val && q > root.val)
            return lcaInBST(root.right, p, q);

        return root;
    }
}
