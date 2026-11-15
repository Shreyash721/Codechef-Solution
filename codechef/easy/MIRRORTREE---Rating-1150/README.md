# MIRRORTREE - Rating 1150

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Mirror Tree

Given a binary tree, check whether it is a structural mirror of itself (i.e., structurally symmetric around its center).

For example, the following binary tree is structurally symmetric:

### Input Format
- The first line of the input contains a single integer $N$ — the number of nodes in the binary tree.
- Next $N - 1$ lines contain three space separated characters $p_i, c_i, R_i$, describing the tree with edge informations - $p_i$ is an integer denoting the parent node of the $i$th edge, $c_i$ is child node, and the letter $R_i$ denotes whether the child is left child or right child, it's value is L if $c_i$ is left child of $p_i$, else R.
### Output Format

Output on the single line, `YES` if the given binary tree is structurally symmetric to itself, `NO` otherwise.

### Constraints
- $1 \leq N \leq 10000$
- $1 \leq p_i, c_i \leq 100000$
- $R_i$ = L or R
- All $p_i$'s and $c_i$'s are distinct.(No same pairs are given twice)
### Sample 1:
Input
Output

```
7
1 2 L
1 3 R
3 4 L
3 5 R
2 6 R
2 7 L
```

```
YES
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-15T06:01:50.357Z  

```java
/*
static class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
*/
private static void isMirrorTree(Node root) {
    
    if((root==null) || (root.left!=null && root.right!=null) || (root.left==null && root.right==null)){
        System.out.print("YES");
    }
    else{
        System.out.println("NO");
    }
    
}


```

---

[View on CodeChef](https://www.codechef.com/problems/MIRRORTREE)