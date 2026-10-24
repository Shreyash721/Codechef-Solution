# BSTLCA - Rating 1050

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### LCA in the BST

Given a binary search tree, and two nodes values $X$ and $Y$, find the LCA (lowest common ancestor) of these two nodes.

For eg., in the following BST, the LCA of nodes with values 3 and 5 is the root node 4:

### Input Format
- The first line of the input contains three space separated integers $N$, $X$ and $Y$ — the number of nodes in the binary search tree, and the two given nodes.
- Next $N - 1$ lines contain three space separated characters $p_i, c_i, R_i$, describing the tree with edge informations - $p_i$ is an integer denoting the parent node of the $i$th edge, $c_i$ is child node, and the letter $R_i$ denotes whether the child is left child or right child, it's value is L if $c_i$ is left child of $p_i$, else R.
### Output Format

Output on the single line, the LCA of node $X$ and $Y$.

### Constraints
- $2 \leq N \leq 10000$
- $1 \leq p_i, c_i \leq 100000$
- $R_i$ = L or R
- All $p_i$'s and $c_i$'s are distinct (same pairs are not repeated).
- $1 \leq X, Y \leq 100000$
### Sample 1:
Input
Output

```
17 22 3
3 1 L
6 3 L
6 21 R
22 6 L
22 31 R
31 23 L
31 32 R
51 22 L
51 94 R
66 63 L
73 66 L
73 93 R
94 73 L
94 97 R
97 95 L
97 99 R
```

```
22
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T05:25:48.288Z  

```java
// import java.util.*;

// class Node {
//     int val;
//     Node left, right;

//     Node(int val) {
//         this.val = val;
//         this.left = this.right = null;
//     }
// }
class Solution {
    public Node lcaInBST(Node root, int p, int q) {
        if (root == null) return null;

        if (p < root.val && q < root.val)
            return lcaInBST(root.left, p, q);

        if (p > root.val && q > root.val)
            return lcaInBST(root.right, p, q);

        return root;
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BSTLCA)