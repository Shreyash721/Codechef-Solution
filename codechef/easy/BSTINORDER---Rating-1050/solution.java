/*
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public static void printNodes(Node root) {
        {
            if(root==null) return;
            printNodes(root.left);
            System.out.println(root.val+" ");
            printNodes(root.right);
            
        }
    }
}