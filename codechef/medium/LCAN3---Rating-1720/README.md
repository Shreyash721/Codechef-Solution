# LCAN3 - Rating 1720

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Triplet LCA

You are given a binary tree and three nodes A, B and C. Find the lowest common ancestor of the three nodes.

- A binary tree is a tree data structure in which every node has at most 2 children nodes.
- Lowest common ancestor of node A, B and C is defined as the lowest node in the tree such that subtree rooted at that node contains all the nodes A,B and C.
- A subtree of a tree T is a tree S consisting of a node in T and all of its descendants in T.
### Input Format
- First line will contain $T$, number of testcases. Then the testcases follow.
- First line of each testcase contains single integer $N$ - number of nodes in Tree
- Next n lines each contains 2 space separated integers $parent_i$ and $node_i$ denoting value of parent and node in the given tree. Note that node with value 1 is the root node and its parent will be given as -1
- Last line of each testcase contains $node_a$, $node_b$ and $node_c$ denoting node values for Node A, B and C.

Following things are guaranteed :

- $node_a$, $node_b$ and $node_c$ are distinct and will be present in the tree.
- Resulting tree is a binary tree.

 **Note:** 

- For C++ language, you need to:

Complete the function in the submit solution tab:

```
int  tripletLCA(Node* root,  int a, int b, int c){...}

```

$\$

### Output Format

Using the functions you have completed, values returned will be checked for the correctness.

- For each testcase a single integer $LCA$ - least common ancestor will be outputted.
### Constraints
- $1 \leq T \leq 1000$
- $4 \leq N \leq 10^5$
- $1 \leq parent_i \leq N$ and $parent_j = -1$ iff $node_j = 1$
- $1 \leq node_i \leq N, node_i = node_j$ iff $i = j$
- $1 \leq node_a, node_b, node_c \leq N$

Sum of $N$ over all test cases will not exceed $10^5$

### Subtasks
- 30 points : $1 \leq T \leq 100$ $4 \leq N \leq 10^3, \sum N \leq 10^3$
- 70 points : Original Constraints
### Sample 1:
Input
Output

```
2
7
1 2
2 3
3 6
3 7
2 4
4 5
-1 1
6 4 5
5
1 2
-1 1
2 3
2 4
1 5
2 3 4

```

```
2
2
```

### Explanation:

 **Testcase 1**  :

![](https://s3.amazonaws.com/codechef_shared/download/Images/Aman/testcase1.jpeg =300x300)

From the tree we can see that LCA of 6 4 5 is 2

 **Testcase 2**  :

![](https://s3.amazonaws.com/codechef_shared/download/Images/Aman/testcase2.jpeg =300x300)

From the tree we can see that LCA of 2 3 4 is 2

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:27:24.915Z  

```java

import java.util.*;

class Main {
    static class Node {
        int val;
        Node left, right;
        Node(int v) { val = v; }
    }

    static Node lca(Node r, int a, int b) {
        if(r == null || r.val == a || r.val == b) return r;
        Node l = lca(r.left, a, b), x = lca(r.right, a, b);
        return l != null && x != null ? r : (l != null ? l : x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            Node[] ar = new Node[n+1];
            for(int i=1; i<=n; i++) ar[i] = new Node(i);

            Node root = null;
            for(int i=0; i<n; i++) {
                int p=sc.nextInt(), c=sc.nextInt();
                if(p==-1) root=ar[c];
                else if(ar[p].left==null) ar[p].left=ar[c];
                else ar[p].right=ar[c];
            }

            int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
            System.out.println(lca(root, lca(root,a,b).val, c).val);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LCAN3)