// class Node {
//     int val;
//     Node left, right;

//     Node(int val) {
//         this.val = val;
//         this.left = this.right = null;
//     }
// }

class Solution {
    private static void  flatten(Node root,ArrayList<Integer> arr){
        if(root!=null){
            flatten(root.left,arr);
            arr.add(root.val);
            flatten(root.right,arr);
        }
    }
    public static void isBST(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        flatten(root,arr);
        int flag=0;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i-1)>arr.get(i)){
                flag=-1;
                break;
            }
        }
        if(flag==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
