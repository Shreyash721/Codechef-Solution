# CHEFSERVER - Rating 1250

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Chef Shortest Route

Chef wants to send a message to Chefina through a cloud provider’s network of servers. The network is modeled as an  **undirected graph**, where servers act as nodes and connections act as edges.

Chef is located at  **server 1**, and Chefina is located at  **server N**.

Your task is to determine:

- Whether a route exists from server 1 to server N
- If it exists, return the minimum number of servers used along such a route (including both start and destination)
## Function Declaration
### Function Name

$getMinimumServers$ - This function finds the minimum number of servers required to send a message from  **server 1**  to  **server N**.

If server `N` cannot be reached, the function returns `-1`.

### Parameters
- $n$ : The total number of servers in the network.
- $serverConnections$ : Each pair represents a bidirectional connection between server a and server b.
## Return Value
- Returns an integer: The minimum number of servers on the shortest route from server 1 to server n Returns -1 if no route exists
## Constraints
- $1 \leq n \leq 200000$
- $1 \leq m \leq 200000$
- $1 \leq a, b \leq n$
- $a \neq b$
- No self-loops or duplicate connections
- The graph is undirected
### Input Format
- The first line contains two integers $n$ and $m$, representing the number of servers and connections.
- The next $m$ lines each contain two integers $a$ and $b$, representing a bidirectional connection between servers $a$ and $b$.
### Output Format
- Print a single integer: The minimum number of servers needed to connect server $1$ to server $n$ Print $-1$ if no such route exists
### Sample 1:
Input
Output

```
5 6
1 2
2 3
1 3
3 5
2 4
4 5
```

```
3
```

### Explanation:

One of the shortest paths discovered by BFS is:

```
1 -> 3 -> 5

```

- Number of connections = 2
- Number of servers = 2 + 1 = 3

Hence, the output is `3`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T07:55:18.129Z  

```java
class Solution {
    public int getMinimumServers(int n, List<int[]> serverConnections) {
        int m=serverConnections.size();

        for(int i=0;i<m;i++){
            int u=serverConnections.get(i)[0];
            int v=serverConnections.get(i)[1];
        }

        return 2;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CHEFSERVER)