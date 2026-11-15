# BTMINDEPTH

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Minimum Depth of Binary Tree

Given a binary tree, print its minimum depth. The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

For example, the minimum depth of the following binary tree is: 2

### Input Format
- The first line of the input contains a single integer $N$ — the number of nodes in the binary tree.
- Next $N - 1$ lines contain three space separated characters $p_i, c_i, R_i$, describing the tree with edge informations - $p_i$ is an integer denoting the parent node of the $i$th edge, $c_i$ is child node, and the letter $R_i$ denotes whether the child is left child or right child, it's value is L if $c_i$ is left child of $p_i$, else R.
### Output Format

Output on the single line - the minimum depth of the given binary tree.

### Constraints
- $1 \leq N \leq 10000$
- $1 \leq p_i, c_i \leq 100000$
- $R_i$ = L or R
- All $p_i$'s and $c_i$'s are distinct.
### Sample 1:
Input
Output

```
5
1 2 L
1 3 R
3 4 L
3 5 R

```

```
2
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T19:08:16.928Z  

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
    public int minDepth(Node root) {
        if(root == null) return 0;

        int l = minDepth(root.left);
        int r = minDepth(root.right);

        if(root.left == null) return 1 + r;
        if(root.right == null) return 1 + l;

        return 1 + Math.min(l, r);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BTMINDEPTH)