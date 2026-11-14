// class Node {
//     int val;
//     Node left, right;

//     Node(int val) {
//         this.val = val;
//         this.left = this.right = null;
//     }
// }
class Solution {
    public void levelOrder(Node root) {
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                Node node=q.poll();
                System.out.print(node.val+" ");
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            System.out.println();
        }
    }
}