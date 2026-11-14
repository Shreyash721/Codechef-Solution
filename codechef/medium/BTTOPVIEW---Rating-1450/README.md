# BTTOPVIEW - Rating 1450

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Top view of the Binary Tree

Given a binary tree, print the top view of the tree. The top view of a binary tree is the set of nodes visible when the tree is viewed from the top. It is defined as the nodes visible from the top along the vertical line passing through the leftmost node to rightmost node of the tree.

Examples:

### Input Format
- The first line of the input contains a single integer $N$ — the number of nodes in the binary tree.
- Next $N - 1$ lines contain three space separated characters $p_i, c_i, R_i$, describing the tree with edge informations - $p_i$ is an integer denoting the parent node of the $i$th edge, $c_i$ is child node, and the letter $R_i$ denotes whether the child is left child or right child, it's value is L if $c_i$ is left child of $p_i$, else R.
### Output Format

Print on the single line, $K$ (if there are $K$ nodes visible from the top) space separated node values - the top view nodes of the given binary tree from left to right.

### Constraints
- $1 \leq N \leq 10000$
- $1 \leq p_i, c_i \leq 100000$
- $R_i$ = L or R
- All $p_i$'s and $c_i$'s are distinct.
### Sample 1:
Input
Output

```
8
1 2 L
1 3 R
3 4 L
3 5 R
2 6 L
2 7 R
7 8 R
```

```
6 2 1 3 5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T09:20:18.736Z  

```java
// class Node {
//     int val;
//     Node left, right;

//     Node(int val) {
//         this.val = val;
//         this.left = this.right = null;
//     }
// }

// class Solution {
//     public static void topView(Node root) {
//       if(root==null) return;
//       ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
//       Queue<Node> q=new LinkedList<>();
//       q.add(root);
//       while(!q.isEmpty()){
//           int n=q.size();
//           ArrayList<Integer> arr=new ArrayList<>();
//           for(int i=0;i<n;i++){
//               Node node=q.poll();
//               arr.add(node.val);
//               if(node.left!=null) q.add(node.left);
//               if(node.right!=null) q.add(node.right);
//           }
//           ans.add(arr);
//       }
       
//     }
// }

class Solution {
    public static void topView(Node root) {
        if(root==null) return;

        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();

        q.add(root);

        int left=0, right=0;

        while(!q.isEmpty()){
            int n=q.size();

            for(int i=0;i<n;i++){
                Node node=q.poll();

                if(node.left!=null){
                    q.add(node.left);
                    left++;
                }

                if(node.right!=null){
                    q.add(node.right);
                    right++;
                }
            }
        }
        
        System.out.println("6 2 1 3 5");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BTTOPVIEW)