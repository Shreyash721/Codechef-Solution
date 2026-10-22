# BSTSEARCH - Rating 1050

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Search in BST

Given a binary search tree and an integer  **`X`**, search if  **`X`**  exists in the BST or not.

(**Note:**  A binary search tree is a rooted binary tree data structure with the key of each internal node being greater than all the keys in the respective node's left subtree and less than the ones in its right subtree.)

For eg., the given tree is a binary search tree and we can easily search whether node $6$ exists in it or not.

## Function Declaration
### Function Name

$searchInBST$ – Searches for a given value in a Binary Search Tree (BST).

### Parameters
- $root$ : A pointer to the root node of the Binary Search Tree.
- $x$ : An integer value that needs to be searched in the BST.
### Return Value
- Returns a boolean value: $true$ if the value $x$ exists in the BST. $false$ otherwise.
### Input Format
- The first line of the input contains two space separated integer $N$ and $X$ — the number of nodes in the binary search tree and the node which we need to search.
- Next $N - 1$ lines contain three space separated characters $p_i, c_i, R_i$, describing the tree with edge informations - $p_i$ is an integer denoting the parent node of the $i$th edge, $c_i$ is child node, and the letter $R_i$ denotes whether the child is left child or right child, it's value is L if $c_i$ is left child of $p_i$, else R.
### Output Format

Output on a single line `YES` if $X$ is present in the given BST, otherwise `NO`.

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
2 1 L
2 3 R
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
**Submitted:** 2026-10-22T17:04:36.009Z  

```java
class Solution {
    // Method to search for a value in BST
    public static boolean searchInBST(Node root, int x) {
       if(root==null) return false;
       if(root.val==x) return true;
       searchInBST(root.left,x);
       searchInBST(root.right,x);
       
       return true;
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BSTSEARCH)