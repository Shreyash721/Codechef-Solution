# BSTPREDECR - Rating 1150

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Predecessor of a Node in BST

Determine the inorder predecessor of a given node `X` in a binary search tree. The inorder predecessor, denoted as node `Y`, is the node that immediately precedes `X` in the inorder traversal of the binary tree. If no such predecessor exists, return `-1`.

For eg., the inorder predecessor of node 6 is node 5 in the following BST:

### Input Format
- The first line of the input contains two space separated integers $N$ and $X$ — the number of nodes in the binary search tree, and the node whose predecessor we're looking for.
- Next $N - 1$ lines contain three space separated characters $p_i, c_i, R_i$, describing the tree with edge informations - $p_i$ is an integer denoting the parent node of the $i$th edge, $c_i$ is child node, and the letter $R_i$ denotes whether the child is left child or right child, it's value is L if $c_i$ is left child of $p_i$, else R.
### Output Format

Output on a single line - the predecessor node value of node $X$, if it exists, else `-1`.

### Constraints
- $1 \leq N \leq 10000$
- $1 \leq p_i, c_i \leq 100000$
- $R_i$ = L or R
- All $p_i$'s and $c_i$'s are distinct.
- $1 \leq X \leq 100000$
### Sample 1:
Input
Output

```
7 6
4 2 L
4 6 R
2 3 R
2 1 L
6 5 L
6 7 R
```

```
5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T06:43:48.864Z  

```java
// import java.util.*;
// import java.io.*;

// class Node {
//     int val;
//     Node left, right;

//     Node(int val) {
//         this.val = val;
//         this.left = this.right = null;
//     }
// }
class Solution {
     private void flatten(Node root,ArrayList<Integer> arr){
       if(root==null) return;
       flatten(root.left,arr);
       arr.add(root.val);
       flatten(root.right,arr);
    }
    public int getPredecessor(Node root, int x) {
        ArrayList<Integer> arr=new ArrayList<>();
        flatten(root,arr);
        int a=arr.indexOf(x);
        return arr.get(a-1);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BSTPREDECR)