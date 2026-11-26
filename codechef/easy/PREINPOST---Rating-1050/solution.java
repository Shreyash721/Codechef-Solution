// // class TreeNode {
// //     int val;
// //     TreeNode left, right;
// //     TreeNode(int x) {
// //         val = x;
// //         left = right = null;
// //     }
// // }


class Solution {
    private ArrayList<Integer> flatten1(TreeNode root){
      ArrayList<Integer> arr=new ArrayList<>();
      if(root==null) return arr;
      arr.add(root.val);
      arr.addAll(flatten1(root.left));
      arr.addAll(flatten1(root.right));
       
      return arr;
    }
    private ArrayList<Integer> flatten2(TreeNode root){
        ArrayList<Integer> arr=new ArrayList<>();
      if(root==null) return arr;
      arr.addAll(flatten2(root.left));
      arr.add(root.val);
      arr.addAll(flatten2(root.right));
       
      return arr;
    }
    private ArrayList<Integer> flatten3(TreeNode root){
        ArrayList<Integer> arr=new ArrayList<>();
      if(root==null) return arr;
      arr.addAll(flatten3(root.left));
      arr.addAll(flatten3(root.right));
      arr.add(root.val);
       
      return arr;
    }
    
    public List<List<Integer>> getTraversals(TreeNode root) {
        return Arrays.asList(flatten2(root),flatten1(root),flatten3(root));
    
    }
}

class Solution {
    private void dfs(TreeNode root, List<Integer> pre, List<Integer> in, List<Integer> post){
        if(root==null) return;

        pre.add(root.val);
        dfs(root.left,pre,in,post);

        in.add(root.val);
        dfs(root.right,pre,in,post);

        post.add(root.val);
    }

    public List<List<Integer>> getTraversals(TreeNode root) {
        List<Integer> pre=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        List<Integer> post=new ArrayList<>();

        dfs(root,pre,in,post);

        return Arrays.asList(in,pre,post);
    }
}
