// class TreeNode {
//     int val;
//     TreeNode left, right;
//     TreeNode(int x) {
//         val = x;
//         left = right = null;
//     }
// }

class Solution {
    private static void order(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return;
        arr.add(root.val);
        order(root.left,arr);
        order(root.right,arr);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        order(root,arr);
        return arr;
    }
}
