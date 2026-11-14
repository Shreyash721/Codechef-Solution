# RIGTHSIDE - Rating 1250

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Right side view of Binary tree

Given the $root$ of a binary tree, imagine standing on the  **right side**  of the tree. Return an array of the values of the nodes you can see ordered from top to bottom.

 **Notes:** 

- Return the rightmost node value at each depth level (top → bottom).
- Expected solutions commonly use BFS level-order traversal or DFS with depth tracking.
### Function Declaration
- Function Name $rightSideView$ — This function returns the list of node values visible when viewing a binary tree from the right side.
- Parameters $root$: A pointer to the root node of the binary tree. The binary tree may contain $0$ to $100$ nodes, and each node contains an integer value or may be null (-1 in level-order input).
- Return Value Returns an array containing the values of the rightmost nodes at each depth level of the binary tree. The values are ordered from top to bottom, representing the nodes visible from the right side.
### Constraints
- $1 \leq T \leq 1000$
- $0 \leq N \leq 100$
- $-100 \leq \text{Node.val} \leq 100$
- Level-order input may contain -1 indicating a null node.
### Input Format
- The first line of input contains a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input: The first line contains a single integer $N$ - size of the array that contains nodes and empty leaf nodes. The second line contains $N$ space-separated integers representing the level-order traversal of the tree, where -1 denotes a null child.
### Output Format

For each test case, output on a new line the  **right side view**  of the binary tree — a sequence of space-separated integers representing the values of the nodes visible from the right side.

### Sample 1:
Input
Output

```
3
7
10 5 15 3 7 -1 20
7
1 2 3 4 5 6 7
5
1 -1 2 -1 3

```

```
10 15 20
1 3 7
1 2 3

```

### Explanation:
- For the first test case:

```
    10
   /  \
  5    15
 / \     \
3   7     20

```

From the right side you see 10, then 15, then 20.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T08:05:49.869Z  

```java
// class TreeNode {
//     int val;
//     TreeNode left, right;
//     TreeNode(int val) {
//         this.val = val;
//         this.left = null;
//         this.right = null;
//     }
// }

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> rt=new ArrayList<>();
        if(root==null) return rt;
        
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
         int n=q.size();
         ArrayList<Integer> arr=new ArrayList<>();
         for(int i=0;i<n;i++){
            TreeNode node=q.poll();
            arr.add(node.val);
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
         }
         ans.add(arr);
        }
        for(int i=0;i<ans.size();i++){
            int s=ans.get(i).size();
            rt.add(ans.get(i).get(s-1));
        }
        return rt;
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RIGTHSIDE)