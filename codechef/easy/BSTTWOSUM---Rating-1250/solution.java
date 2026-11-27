// import java.util.*;

// class Node {
//     int val;
//     Node left;
//     Node right;

//     Node(int val) {
//         this.val = val;
//         this.left = null;
//         this.right = null;
//     }
// }
class Solution {
    private static void flatten(Node root, ArrayList<Integer> arr){
        if(root!=null){
            flatten(root.left,arr);
            arr.add(root.val);
            flatten(root.right,arr);
        }
    }

    public void twoSumBST(Node root, int S) {
        ArrayList<Integer> arr=new ArrayList<>();
        flatten(root,arr);
        String flag="NO";
        int i=0;
        int j=arr.size()-1;
        while(i<j){
            int sum=arr.get(i)+arr.get(j);
            if(sum==S){
                flag="YES";
                break;
            }
            else if(sum<S) i=i+1;
            else j=j-1;
        }
        
        System.out.println(flag);
        
    }
}
