# BTHEIGHT - Rating 1050

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Height of Binary Tree

Given a connected binary tree with  **N**  nodes, find the height of it. (**Note:**  The height of a binary tree is the number of edges between the tree's root and its furthest leaf.)

For example, the following binary tree has height `2`:

Hint: While traversing the Tree, you will have to store the height of children and use that to calculate the height of parent.

### Input Format
- The first line of the input contains a single integer $N$ — the number of nodes in the binary tree.
- Next $N - 1$ lines contain three space separated characters $p_i, c_i, R_i$, describing the tree with edge informations - $p_i$ is an integer denoting the parent node of the $i$th edge, $c_i$ is child node, and the letter $R_i$ denotes whether the child is left child or right child, it's value is L if $c_i$ is left child of $p_i$, else R.
### Output Format

Output on the single line, the height of the given binary tree.

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
**Submitted:** 2026-11-14T09:32:32.653Z  

```java
/*
class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}
*/

class Solution {
    public int heightOfBinaryTree(Node root) {
        if(root==null) return -1;
       int l=1+heightOfBinaryTree(root.left);
       int r=1+heightOfBinaryTree(root.right);
       
       return Math.max(r,l);
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/BTHEIGHT)