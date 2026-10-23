class Solution {
    private static void flatten(Node root,ArrayList<Integer> arr){
        if(root!=null){
            flatten(root.left,arr);
            arr.add(root.val);
            flatten(root.right,arr);
        }
    }
  
    public static void printMinDifference(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        flatten(root,arr);
        
        System.out.println(arr.get(1)-arr.get(0));
        
        
    }
}
