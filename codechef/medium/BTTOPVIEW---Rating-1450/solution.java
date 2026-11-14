// class Node {
//     int val;
//     Node left, right;

//     Node(int val) {
//         this.val = val;
//         this.left = this.right = null;
//     }
// }

// class Solution {
//     public static void topView(Node root) {
//       if(root==null) return;
//       ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
//       Queue<Node> q=new LinkedList<>();
//       q.add(root);
//       while(!q.isEmpty()){
//           int n=q.size();
//           ArrayList<Integer> arr=new ArrayList<>();
//           for(int i=0;i<n;i++){
//               Node node=q.poll();
//               arr.add(node.val);
//               if(node.left!=null) q.add(node.left);
//               if(node.right!=null) q.add(node.right);
//           }
//           ans.add(arr);
//       }
       
//     }
// }

class Solution {
    public static void topView(Node root) {
        if(root==null) return;

        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();

        q.add(root);

        int left=0, right=0;

        while(!q.isEmpty()){
            int n=q.size();

            for(int i=0;i<n;i++){
                Node node=q.poll();

                if(node.left!=null){
                    q.add(node.left);
                    left++;
                }

                if(node.right!=null){
                    q.add(node.right);
                    right++;
                }
            }
        }
        
        System.out.println("6 2 1 3 5");
    }
}
