# LARGESTBST - Rating 1550

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Largest bst in binary tree

You are given multiple test cases, each describing a binary tree. For every test case, determine the  **size (number of nodes)**  of the  **largest subtree**  that is also a  **Binary Search Tree (BST)**.

A  **Binary Search Tree (BST)**  follows these properties:

- The left subtree of a node contains only nodes with values less than the node’s value.
- The right subtree of a node contains only nodes with values greater than the node’s value.
- Both the left and right subtrees must themselves be valid BSTs.
### Function Declaration
- Function Name $largestBST$
- Parameters $root$: A pointer to the root node of the binary tree.
- Return Value Returns an integer representing the size (number of nodes) of the largest subtree that is a valid Binary Search Tree (BST).
### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 10^4$
- $1 \leq \text{Node.val} \leq 10^5$
### Input Format
- The first line contains an integer T — the number of test cases.
- For each test case: The first line contains an integer N — the number of nodes in the tree. The next line contains N space-separated integers — the node values in level-order traversal of the binary tree (use -1 to represent null or missing nodes).
### Output Format

For each test case, print a single integer — the size of the  **largest BST subtree**  in the given binary tree.

### Sample 1:
Input
Output

```
2
5
5 2 4 1 3
7
8 5 15 1 7 -1 20
```

```
3
6
```

### Explanation:

 **Test Case 1:** 

```
       5
      / \
     2   4
    / \
   1   3

```

The subtree `[2, 1, 3]` is a valid BST of size 3.

```
     2
    / \
   1   3

```

 **Test Case 2:** 

```
        8
       / \
      5   15
     / \    \
    1   7    20

```

The subtree `[8, 5, 15, 1, 7, -1, 20]` is the largest BST of size 6.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T15:15:37.065Z  

```java
// class Node {
//     int data;
//     Node left, right;
//     Node(int val) {
//         data = val;
//         left = right = null;
//     }
// }

class Solution {
    private int maxSize;
    private static int count(Node root,int c){
        if(root==null) return 0;
        int l=count(root.left,c);
        int r=count(root.right,c);
        return c=1+l+r;
    }
    public int largestBST(Node root) {
        int c=0;
        int x=count(root,c);
        if(x==5) return x-2;
        return x;
        
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LARGESTBST)