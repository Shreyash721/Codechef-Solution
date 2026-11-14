# BTZIGZAG - Rating 1350

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### ZigZag Traversal

Given a binary tree, print the zigzag level order traversal of its nodes. (i.e., from left to right, then right to left for the next level and alternate between).

For example, the zigzag traversal of the following binary tree is:
1
3 2
4 5

### Output Format

Output on the L separate lines, $N$ space separated integers - its nodes in the zigzag level order traversal of the given tree, where L is total no. of levels in the given tree.

### Constraints
- $1 \leq N \leq 10000$
- $1 \leq p_i, c_i \leq 100000$
- $R_i$ = L or R
- All $p_i$'s and $c_i$'s are distinct.
### Sample 1:
Input
Output

```
5
1 2 L
1 3 R
3 4 L
3 5 R

```

```
1
3 2
4 5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T06:56:48.807Z  

```java
// class Node {
//     int val;
//     Node left, right;

//     Node(int val) {
//         this.val = val;
//         this.left = this.right = null;
//     }
// }
class Solution {
    public void zigzagTraversal(Node root) {
        if(root==null) return;
        int index=0;
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node node=q.poll();
                arr.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            if(index%2!=0){
                Collections.reverse(arr);
            }
            index++;
            result.add(arr);
        }
        for(int i=0;i<result.size();i++){
            for(int j=0;j<result.get(i).size();j++){
                System.out.print(result.get(i).get(j));
            }
            System.out.println();
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BTZIGZAG)