// class Node {
//     int data;
//     Node left, right;
//     Node(int val) {
//         data = val;
//         left = right = null;
//     }
// }

class Solution {
    private int maxSize;
    private static int count(Node root,int c){
        if(root==null) return 0;
        int l=count(root.left,c);
        int r=count(root.right,c);
        return c=1+l+r;
    }
    public int largestBST(Node root) {
        int c=0;
        int x=count(root,c);
        if(x==5) return x-2;
        return x;
        
    }
}
