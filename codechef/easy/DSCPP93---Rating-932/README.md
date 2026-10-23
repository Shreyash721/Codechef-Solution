# DSCPP93 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Implementation - Create BST

In this section, we will learn how to make a BST from an array of numbers given to us.

Note - We take the first element of the array as our root so the tree might not always be balanced.

We have made the first element as our node, now for inserting the rest of the nodes the logic followed is (the process always starts from the root):

- If the element is smaller than the root If the left child of root is null, the new node is inserted there and the process is terminated. Else our root pointer is updated to the left child and the process is repeated from start taking this left child as root (we do this because the element is smaller than the root, so it is bound to be inserted in the left subtree)
- If the element is larger than the root If the right child of root is null, the new node is inserted there and the process is terminated. Else our root pointer is updated to the right child and the process is repeated from start taking this right child as root

For a given array of numbers [8,3,10,1,6,14], the image below shows the order in which the tree is created.

### Video Explanation

Check out the code on the right to see the implementation and run the code to see how tree is formed.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T06:23:03.252Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/DSCPP93)