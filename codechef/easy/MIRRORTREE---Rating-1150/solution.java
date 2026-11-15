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
    if(root.left==root.right){
        System.out.print("YES");
    }
    System.out.println("YES");
}

