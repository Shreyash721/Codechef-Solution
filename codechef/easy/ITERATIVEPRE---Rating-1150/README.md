# ITERATIVEPRE - Rating 1150

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Iterative Preorder Traversal of Binary Tree

You are given the level-order representation of a binary tree (with `null` representing missing nodes). Your task is to print the  **preorder traversal**  (Root → Left → Right) of the binary tree.

#### Follow-up

The recursive approach is simple — can you implement it  **iteratively**  using a stack?

## Function Declaration
### Function Name

$preorderTraversal$

### Parameters
- $root$ : A pointer/reference to the root node of the binary tree.
### Return Value
- Returns an array of integers.
## Constraints:
- $1 \leq T \leq 10$
- $0 \leq N \leq 100$
- $-100 \leq \text{Node.val} \leq 100$
- The input represents a valid binary tree structure.

 **The input and output formats given below are only if you want to test using custom inputs.** 

### Input Format
- The first line contains an integer $T$, the number of test cases.
- For each test case: The first line contains an integer $N$, the number of elements in the array. The second line contains $N$ elements representing the level-order traversal of the binary tree. Use $null$ to denote a missing (non-existent) child.
### Output Format

For each test case, print the preorder traversal of the tree as space-separated values.

### Sample 1:
Input
Output

```
2
7
5 3 8 1 4 null 9
7
10 6 15 3 8 12 20
```

```
5 3 1 4 8 9
10 6 3 8 15 12 20
```

### Explanation:

Test case 1:

```
        5
       / \
      3   8
     / \   \
    1   4   9

```

Preorder traversal ? `[5, 3, 1, 4, 8, 9]`

Test case 2:

```
         10
        /  \
       6    15
      / \   / \
     3   8 12 20

```

Preorder traversal ? `[10, 6, 3, 8, 15, 12, 20]`

### Sample 2:
Input
Output

```
1
5
1 null 2 null 3

```

```
1 2 3
```

### Explanation:

```
1
 \
  2
   \
    3

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T18:52:48.271Z  

```java
// class TreeNode {
//     int val;
//     TreeNode left, right;
//     TreeNode(int x) {
//         val = x;
//         left = right = null;
//     }
// }

class Solution {
    private static void order(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return;
        arr.add(root.val);
        order(root.left,arr);
        order(root.right,arr);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        order(root,arr);
        return arr;
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ITERATIVEPRE)