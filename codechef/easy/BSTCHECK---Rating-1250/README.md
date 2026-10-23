# BSTCHECK - Rating 1250

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Check for BST

Check if the given binary tree is a valid Binary Search Tree (BST).

A valid BST adheres to the following criteria:

- The left subtree of a node comprises only nodes with keys less than the node's key.
- The right subtree of a node comprises only nodes with keys greater than the node's key.
- Both the left and right subtrees must also be valid Binary Search Trees.

For eg., the given binary tree is a valid BST.

## Function Declaration
### Function Name

$isBST$ – This function checks whether the given binary tree is a valid Binary Search Tree (BST).

### Parameters
- $root$ : A pointer to the root node of the binary tree Each node is defined as: struct Node { int val; Node  *left; Node* right; };
### Return Value
- The function does not return any value.
- It should print: "YES" if the binary tree is a valid Binary Search Tree "NO" otherwise
## Constraints
- $1 \leq N \leq 10000$
- $1 \leq p_i, c_i \leq 100000$
- $R_i \in {L, R}$
- All node values are distinct
- The input represents a valid binary tree structure
### Input Format
- The first line contains a single integer $N$ — the number of nodes in the binary tree.
- The next $N - 1$ lines each contain three space-separated values: $p_i$ — parent node value $c_i$ — child node value $R_i$ — either L or R, indicating whether the child is a left or right child
### Output Format
- Output a single line: "YES" if the binary tree satisfies all Binary Search Tree properties "NO" otherwise
### Sample 1:
Input
Output

```
7 
4 2 L
4 6 R
2 3 R
2 1 L
6 5 L
6 7 R
```

```
YES
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T04:59:23.809Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/BSTCHECK)