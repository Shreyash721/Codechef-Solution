# BSTINORDER - Rating 1050

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Print nodes in sorted order

Given a binary search tree, print its nodes in sorted order.

For eg., the nodes in sorted order of the given BST are: 1 2 3 4 5 6 7

### Input Format
- The first line of the input contains s single integer $N$ — the number of nodes in the binary search tree.
- Next $N - 1$ lines contain three space separated characters $p_i, c_i, R_i$, describing the tree with edge informations - $p_i$ is an integer denoting the parent node of the $i$th edge, $c_i$ is child node, and the letter $R_i$ denotes whether the child is left child or right child, it's value is L if $c_i$ is left child of $p_i$, else R.
### Output Format

Output on a single line $N$ space separated integers - the node values of given BST in sorted order.

### Constraints
- $1 \leq N \leq 10000$
- $1 \leq p_i, c_i \leq 100000$
- $R_i$ = L or R
- All $p_i$'s and $c_i$'s are distinct.
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
1 2 3 4 5 6 7
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T06:06:03.070Z  

```java
/*
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public static void printNodes(Node root) {
        {
            if(root==null) return;
            printNodes(root.left);
            System.out.println(root.val+" ");
            printNodes(root.right);
            
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BSTINORDER)