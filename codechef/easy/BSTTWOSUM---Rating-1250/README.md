# BSTTWOSUM - Rating 1250

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### BST Two Sum

Given a binary search tree and an integer $S$, check if there exist two elements in the BST such that their sum is equal to $S$.

For eg., in the following BST, for given S = 8, there exists few pairs of nodes whose sum is 8:

### Input Format
- The first line of the input contains two space separated integers $N$ and $S$ — the number of nodes in the binary search tree, and the target sum.
- Next $N - 1$ lines contain three space separated characters $p_i, c_i, R_i$, describing the tree with edge informations - $p_i$ is an integer denoting the parent node of the $i$th edge, $c_i$ is child node, and the letter $R_i$ denotes whether the child is left child or right child, it's value is L if $c_i$ is left child of $p_i$, else R.
### Output Format

Print `YES`, if there exists at least one such pair of nodes, whose sum is equal to $S$, else `NO`.

### Constraints
- $1 \leq N \leq 10000$
- $1 \leq p_i, c_i \leq 100000$
- $R_i$ = L or R
- All $p_i$'s and $c_i$'s are distinct.
- $1 \leq S \leq 150000$
### Sample 1:
Input
Output

```
50 106
7 2 L
7 10 R
11 7 L
11 27 R
27 24 L
35 11 L
35 38 R
37 36 L
38 37 L
38 40 R
40 39 L
50 35 L
50 87 R
61 58 L
61 67 R
70 61 L
70 81 R
81 80 L
87 70 L
87 94 R
92 89 L
94 92 L
94 97 R
97 96 L
100 50 L
100 153 R
104 102 L
104 107 R
108 104 L
108 112 R
112 110 L
113 108 L
113 126 R
123 114 L
126 123 L
126 137 R
137 132 L
153 113 L
153 187 R
174 163 L
180 174 L
180 186 R
186 184 L
187 180 L
187 191 R
190 188 L
191 190 L
191 199 R
199 196 L
```

```
YES
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T06:12:35.578Z  

```java
// import java.util.*;

// class Node {
//     int val;
//     Node left;
//     Node right;

//     Node(int val) {
//         this.val = val;
//         this.left = null;
//         this.right = null;
//     }
// }
class Solution {
    private static void flatten(Node root, ArrayList<Integer> arr){
        if(root!=null){
            flatten(root.left,arr);
            arr.add(root.val);
            flatten(root.right,arr);
        }
    }

    public void twoSumBST(Node root, int S) {
        ArrayList<Integer> arr=new ArrayList<>();
        flatten(root,arr);
        String flag="NO";
        int i=0;
        int j=arr.size()-1;
        while(i<j){
            int sum=arr.get(i)+arr.get(j);
            if(sum==S){
                flag="YES";
                break;
            }
            else if(sum<S) i=i+1;
            else j=j-1;
        }
        
        System.out.println(flag);
        
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BSTTWOSUM)