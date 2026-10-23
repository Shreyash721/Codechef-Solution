# BSTKTHMAX - Rating 1150

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Kth Largest Node in BST

Given a binary search tree and an integer $K$, find the $K$th largest node in it.

For eg., if K = 3, the answer would be 5 for the following BST:

### Input Format
- The first line of the input contains two space separated integers $N$ and $K$ — the number of nodes in the binary search tree, and the value of $K$.
- Next $N - 1$ lines contain three space separated characters $p_i, c_i, R_i$, describing the tree with edge informations - $p_i$ is an integer denoting the parent node of the $i$th edge, $c_i$ is child node, and the letter $R_i$ denotes whether the child is left child or right child, it's value is L if $c_i$ is left child of $p_i$, else R.
### Output Format

Output on a single line - the $K$th largest node in the given BST.

### Constraints
- $2 \leq N \leq 10000$
- $1 \leq p_i, c_i \leq 100000$
- $R_i$ = L or R
- All $p_i$'s and $c_i$'s are distinct.
- $1 \leq K \leq N$
### Sample 1:
Input
Output

```
7 3
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
**Submitted:** 2026-10-23T04:05:39.214Z  

```java
// import java.util.*;

// class Node {
//     int val;
//     Node left, right;

//     Node(int val) {
//         this.val = val;
//         left = right = null;
//     }
// }

class Solution {
    private void flatten(Node root,ArrayList<Integer> arr){
        
        if(root!=null) flatten(root.left,arr);
        if(root!=null) arr.add(root.val);
        if(root!=null) flatten(root.right,arr);
    }
    public int kthLargestNode(Node root, int k) {
        ArrayList<Integer> arr=new java.util.ArrayList<>();
        flatten(root,arr);
        int d=arr.size()-k;
        
        return arr.get(d);
        
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BSTKTHMAX)