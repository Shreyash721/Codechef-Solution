// class Node {
//     int val;
//     Node left, right;

//     Node(int val) {
//         this.val = val;
//         this.left = this.right = null;
//     }
// }
class Solution {
    public void zigzagTraversal(Node root) {
        if(root==null) return;
        int index=0;
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node node=q.poll();
                arr.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            if(index%2!=0){
                Collections.reverse(arr);
            }
            index++;
            result.add(arr);
        }
        for(int i=0;i<result.size();i++){
            for(int j=0;j<result.get(i).size();j++){
                System.out.print(result.get(i).get(j));
            }
            System.out.println();
        }
    }
}
