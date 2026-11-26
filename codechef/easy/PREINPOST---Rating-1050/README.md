# PREINPOST - Rating 1050

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Preorder, Inorder, and Postorder Traversal in one

You are given the root of a binary tree represented as an array in level order format. Your task is to return  **three traversals**  of the binary tree:

- In-order Traversal
- Pre-order Traversal
- Post-order Traversal

Each traversal should be returned as a list of integers.

### Function Declaration
- Function Name $getTraversals$
- Parameters $root$: A pointer to the root node of the binary tree.
- Return Value Returns a 2D vector of integers containing three traversals of the binary tree in the following order: In-order Traversal Pre-order Traversal Post-order Traversal
### Constraints
- $1 \leq T \leq 10$
- $1 \leq N \leq 10^5$
- $0 \leq \text{Node.val} \leq 10^5$
- $(-1)$ denotes a null node
### Input Format
- The first line contains an integer T, the number of test cases.
- For each test case: The first line contains an integer N, the number of elements in the array. The second line contains N space-separated values, representing the tree in level order. The value -1 represents a null node.
### Output Format

[ [InOrder], [PreOrder], [PostOrder] ]

### Sample 1:
Input
Output

```
1
7
10 5 15 3 7 -1 18
```

```
[[3, 5, 7, 10, 15, 18], [10, 5, 3, 7, 15, 18], [3, 7, 5, 18, 15, 10]]
```

### Explanation:

The binary tree is:

```
        10
       /  \
      5    15
     / \     \
    3   7     18

```

- In-order: [3, 5, 7, 10, 15, 18]
- Pre-order: [10, 5, 3, 7, 15, 18]
- Post-order: [3, 7, 5, 18, 15, 10]
### Sample 2:
Input
Output

```
1
7
1 2 3 -1 -1 4 5
```

```
[[2, 1, 4, 3, 5], [1, 2, 3, 4, 5], [2, 4, 5, 3, 1]]
```

### Explanation:

The binary tree is:

```
       1
      / \
     2   3
        / \
       4   5

```

- In-order: [2, 1, 4, 3, 5]
- Pre-order: [1, 2, 3, 4, 5]
- Post-order: [2, 4, 5, 3, 1]
### Sample 3:
Input
Output

```
1
11
8 4 10 2 6 9 12 -1 -1 5 7
```

```
[[2, 4, 5, 6, 7, 8, 9, 10, 12], [8, 4, 2, 6, 5, 7, 10, 9, 12], [2, 5, 7, 6, 4, 9, 12, 10, 8]]
```

### Explanation:

The binary tree is:

```
          8
        /   \
       4     10
      / \    / \
     2   6  9  12
        / \
       5   7

```

- In-order: [2, 4, 5, 6, 7, 8, 9, 10, 12]
- Pre-order: [8, 4, 2, 6, 5, 7, 10, 9, 12]
- Post-order: [2, 5, 7, 6, 4, 9, 12, 10, 8]

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T07:01:18.106Z  

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
    private ArrayList<Integer> flatten1(TreeNode root){
      ArrayList<Integer> arr=new ArrayList<>();
       if(root==null) return arr;
       arr.add(root.val);
       arr.addAll(flatten1(root.left));
       arr.addAll(flatten1(root.right));
       
       return arr;
    }
    private ArrayList<Integer> flatten2(TreeNode root){
        ArrayList<Integer> arr=new ArrayList<>();
       if(root==null) return arr;
       arr.addAll(flatten2(root.left));
       arr.add(root.val);
       arr.addAll(flatten2(root.right));
       
       return arr;
    }
    private ArrayList<Integer> flatten3(TreeNode root){
        ArrayList<Integer> arr=new ArrayList<>();
       if(root==null) return arr;
       arr.addAll(flatten3(root.left));
       arr.addAll(flatten3(root.right));
       arr.add(root.val);
       
       return arr;
    }
    
    public List<List<Integer>> getTraversals(TreeNode root) {
        return Arrays.asList(flatten2(root),flatten1(root),flatten3(root));
    
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PREINPOST)