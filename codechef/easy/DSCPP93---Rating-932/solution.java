class Codechef {

    private static class MyBST{
        private class node{
            int val;
            node left;
            node right;

            public node(int val){
                this.val = val;
                this.left = null;
                this.right = null;
            }
        }

        node root;

        public MyBST(){
            root=null;
        }

        public void insert(int element){
            if(root==null){
                // Assigning first element of array as root
                root = new node(element);
                return;
            }
            node current = root;
            // We start traversal to insertion position from root
            while(true){
                if(element<current.val){
                    // If the value is lesser we find in left subtree where to insert
                    if(current.left==null){
                        System.out.printf("Inserting %d in left of %d\n",element,current.val);
                        current.left = new node(element);
                        break;
                        // End the loop when insertion is done
                    }
                    else{
                        // Repeat the process for left subtree which is also a BST
                        current=current.left;
                    }
                }
                else{
                    if(current.right==null){
                        System.out.printf("Inserting %d in right of %d\n",element,current.val);
                        current.right = new node(element);
                        break;
                    }
                    else{
                        current=current.right;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8,3,10,1,6,14};
        MyBST tree = new MyBST();
        for(int j : arr){
            tree.insert(j);
        }
        System.out.println("The BST is created!");
    }
}