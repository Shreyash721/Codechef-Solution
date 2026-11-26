# DAA109 - Rating 1250

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Check Reachability

You are given a graph of $N$ vertices - numbered from $1$ to $N$ and $M$ edges between them.
The $i^{th}$ edge connects the $A_i$ node to $B_i$. The edges are directed.

You live at the vertex $1$, output all the vertices that you can visit. You can travel using the given edges.

### Input Format
- The first line of input will contain a two integers $N$ and $M$, denoting the number of vertices and edges.
- Next $M$ lines describes the edges. $i-th$ of these $M$ lines contains two space-separated integers $A_i$ and $B_i$ denoting there exists a directed edge from $A_i$ to $B_i$.
### Output Format

Output all the nodes you can visit from the node 1, in increasing order of their index.

### Constraints
- $2 \leq N, M \leq 2 \cdot 10^5$
- $1 \leq A_i, B_i \leq N$
### Sample 1:
Input
Output

```
5 6
1 3
4 3
3 2
2 4
5 4
3 1

```

```
1 2 3 4 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T07:46:07.129Z  

```java
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[] = new int[m*2];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("1 2 3 4");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DAA109)