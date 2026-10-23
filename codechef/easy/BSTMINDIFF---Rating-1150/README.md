# BSTMINDIFF - Rating 1150

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Min Difference in BST

Given a Binary Search Tree (BST), return the minimum difference between the values of any two different nodes in the tree.

For eg., the min difference between any two is 1 in the following tree.

### Input Format
- The first line of the input contains s single integer $N$ — the number of nodes in the binary search tree.
- Next $N - 1$ lines contain three space separated characters $p_i, c_i, R_i$, describing the tree with edge informations - $p_i$ is an integer denoting the parent node of the $i$th edge, $c_i$ is child node, and the letter $R_i$ denotes whether the child is left child or right child, it's value is L if $c_i$ is left child of $p_i$, else R.
### Output Format

Output on a single line - the min difference between any two nodes in given BST.

### Constraints
- $2 \leq N \leq 10000$
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
1
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T04:47:43.576Z  

```java
class Solution {
    private static void flatten(Node root,ArrayList<Integer> arr){
        if(root!=null){
            flatten(root.left,arr);
            arr.add(root.val);
            flatten(root.right,arr);
        }
    }
  
    public static void printMinDifference(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        flatten(root,arr);
        
        System.out.println(arr.get(1)-arr.get(0));
        
        
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BSTMINDIFF)