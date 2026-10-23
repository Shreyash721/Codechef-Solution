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
        int d=100000;
        for(int i=1;i<arr.size();i++){
            int diff=arr.get(i)-arr.get(i-1);
            d=Math.min(d,diff);
        }
        
        System.out.println(d);
    }
}
