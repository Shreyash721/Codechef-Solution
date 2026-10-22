class Solution {
    // Method to search for a value in BST
    public static boolean searchInBST(Node root, int x) {
       if(root==null) return false;
       if(root.val==x) return true;
       searchInBST(root.left,x);
       searchInBST(root.right,x);
       
       return true;
    }
}
