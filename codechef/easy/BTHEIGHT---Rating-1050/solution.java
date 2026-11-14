/*
class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}
*/

class Solution {
    public int heightOfBinaryTree(Node root) {
        if(root==null) return -1;
       int l=1+heightOfBinaryTree(root.left);
       int r=1+heightOfBinaryTree(root.right);
       
       return Math.max(r,l);
    }
}

