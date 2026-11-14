// class TreeNode {
//     int val;
//     TreeNode left, right;
//     TreeNode(int val) {
//         this.val = val;
//         this.left = null;
//         this.right = null;
//     }
// }

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> rt=new ArrayList<>();
        if(root==null) return rt;
        
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
         int n=q.size();
         ArrayList<Integer> arr=new ArrayList<>();
         for(int i=0;i<n;i++){
            TreeNode node=q.poll();
            arr.add(node.val);
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
         }
         ans.add(arr);
        }
        for(int i=0;i<ans.size();i++){
            int s=ans.get(i).size();
            rt.add(ans.get(i).get(s-1));
        }
        return rt;
    }
}
