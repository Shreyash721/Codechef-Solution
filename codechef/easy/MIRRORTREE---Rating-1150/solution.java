/*
static class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
*/
private static void isMirrorTree(Node root) {
    
    if((root==null) || (root.left!=null && root.right!=null) || (root.left==null && root.right==null)){
        System.out.print("YES");
    }
    else{
        System.out.println("NO");
    }
    
}

