# IDENTTREES - Rating 1050

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Identical Binary Trees

Given two undirected binary trees T1 and T2, check if they are the identical or not.

Two binary trees are considered identical if they are structurally same, and the nodes have the same value.

For example, the following two binary trees are identical:

### Input Format
- The first line of the input contains two space separated integers $N$ and $M$ — the number of nodes in the two binary trees.
- Next $N - 1$ lines contain three space separated characters $p1_i, c1_i, R_i$, describing the first tree with edge informations - $p1_i$ is an integer denoting the parent node of the $i$th edge, $c1_i$ is child node, and the letter $R_i$ denotes whether the child is left child or right child, it's value is L if $c1_i$ is left child of $p1_i$, else R.
- Similarly, next $M - 1$ lines contain three space separated characters $p2_i, c2_i, R_i$, describing the second tree with edge informations - $p2_i$ is an integer denoting the parent node of the $i$th edge, $c2_i$ is child node, and the letter $R_i$ denotes whether the child is left child or right child, it's value is L if $c2_i$ is left child of $p2_i$, else R.
### Output Format

Output on the single line, `YES` if the two trees are identical else `NO` otherwise.

### Constraints
- $1 \leq N, M \leq 10000$
- $1 \leq p1_i, p2_i, c1_i, c2_i \leq 100000$
- $R_i$ = L or R
- All $p_i$'s and $c_i$'s are distinct.
### Sample 1:
Input
Output

```
5 5
1 2 L
1 3 R
3 4 L
3 5 R
1 2 L
1 3 R
3 4 L
3 5 R
```

```
YES
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T09:38:41.936Z  

```java
class Solution {
    boolean areIdenticalTrees(Node root1, Node root2) {
        if(root1==null && root2==null) return true;
    
        if((root1!=null && root2==null) || (root1==null && root2!=null)) return false;
       if(root1.val!=root2.val) return false; 
       return (areIdenticalTrees(root1.left,root2.left) && areIdenticalTrees(root1.right, root2.right));
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/IDENTTREES)