# INSDELDLL - Rating 1300

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Insert and Delete in Doubly Linked List

You are given the head of a doubly linked list $A$ of length $N$. The values in the list are $A_1, A_2, \ldots, A_N$ respectively. You need to complete a function that inserts a node with a given value at the given position and a function that deletes a node at the given position. The positions are numbered from $1$ to $N$.

### Input Format
- The first line of the input contains a single integer $T$ - the number of test cases. The description of $T$ test cases follows.
- The first line of each test case contains two space-separated integers $N$ and $Q$.
- The second line of each test case contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$.
- $Q$ lines follow. The $i$-th of these lines starts with an integer $T_i$ denoting the type of the query. If $T_i=1$, the $i$-th lines contains two space-separated integers $P_i$ and $V_i$ denoting the position and the value of the node that should be inserted respectively. If $T_i=2$, the $i$-th line contains a single integer $P_i$ denoting the position of the node that should be deleted. It is guaranteed that it will be possible to insert a node at the given position or delete the node at the given position.

 **Note:** 

- For Java language, you need to:

Complete the functions in the submit solution tab:

```
Node insertNode(Node head, int position, int value){...}

Node deleteNode(Node head, int position){...}

```

$\$

- For C++ language, you need to:

Complete the function in the submit solution tab:

```
Node *insertNode(struct Node*  head, int position, int value){...}

Node *deleteNode(struct Node*  head, int position){...}

```

$\$

- For Python language, you need to:

Complete the function in the submit solution tab:

```
def insertNode(head, position, value):

def deleteNode(head, position):

```

### Output Format
- For each query in each test case, the appropriate function you completed will be called and it should return the head of the doubly-linked list on which the appropriate operation has been performed.
### Constraints
- $1 \leq T \leq 10$
- $1 \leq N \leq 1000$
- $1 \leq Q \leq 100$
- $1 \leq A_i \leq 10^9$ for each valid $i$
- $1 \leq T_i \leq 2$ for each valid $i$
- when deleting a node, $P_i$ is between $1$ and the current size of the list for each valid $i$
- when inserting a node, $P_i$ is between $1$ and the current size of the list plus one for each valid $i$
- the list will not become empty after any query
- the size of the list will be at most $1008$ after each query
- $1 \leq V_i \leq 10^9$
- the sum of $N$ over all test cases does not exceed $1000$
### Sample 1:
Input
Output

```
1
5 3
1 2 3 4 5
2 2
1 2 6
2 5
```

```
1 6 3 4
```

### Explanation:

 **Example case 1:**  After deleting the node at position $2$, the order of the values is $[1,3,4,5]$. After inserting a node with value $6$ at the position $2$, the order of the values is $[1,6,3,4,5]$. Finally, after deleting the node at position $5$, the order of the values is $[1,6,3,4]$.

### Sample 2:
Input
Output

```
1
3 4
1 2 3
1 4 4
1 5 1
2 1
2 4
```

```
2 3 4
```

### Explanation:

 **Example case 1:**  After inserting a node with value $4$ at the end of the list, the order of the values is $[1,2,3,4]$. After inserting a node with value $1$ at the end of the list, the order of the values is $[1,2,3,4,1]$. After deleting the first node of the list, the order of the values is $[2,3,4,1]$. Finally, after deleting the last node of the list, the order of the values is $[2,3,4]$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T07:12:37.953Z  

```java
/*class Node{
    int val;
    Node next;
    Node prev;
    Node(int x){
    	val = x; 
    	next = null;
    	prev = null;
    }
}*/

static Node insertNode(Node head, int position, int value) {
    Node newNode = new Node(value);

    // Insert at the beginning
    if (position == 1) {
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }

    Node curr = head;

    // Move to the node before the insertion position
    for (int i = 1; i < position - 1; i++) {
        curr = curr.next;
    }

    newNode.next = curr.next;
    newNode.prev = curr;

    if (curr.next != null) {
        curr.next.prev = newNode;
    }

    curr.next = newNode;

    return head;
}

static Node deleteNode(Node head, int position) {

    // Delete the first node
    if (position == 1) {
        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        return head;
    }

    Node curr = head;

    // Move to the node to be deleted
    for (int i = 1; i < position; i++) {
        curr = curr.next;
    }

    // Update previous node's next pointer
    curr.prev.next = curr.next;

    // Update next node's previous pointer
    if (curr.next != null) {
        curr.next.prev = curr.prev;
    }

    return head;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/INSDELDLL)