# SORTLL012

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sort a Linked List of 0s, 1s, and 2s

You are given the head of a singly linked list consisting of nodes containing only the integers $0$, $1$, or $2$.
Your task is to sort the linked list such that all $0$s come first, followed by all $1$s, and then all $2$s.

You must perform the sorting  **in-place**  — that is, by rearranging the links between existing nodes, not by creating any new nodes.

## Function Declaration
### Function Name

$sortList$ – This function sorts a linked list containing only $0$s, $1$s, and $2$s.

### Parameters
- $head$ : A pointer to the head of the singly linked list.
### Return Value
- Returns a pointer to the head of the sorted linked list.
- If the list is empty, return $NULL$.
## Constraints
- $1 \leq T \leq 100$
- $0 \leq N \leq 10^5$
- $0 \leq Node.data \leq 2$
- $\text{Sum of } N \text{ over all test cases} \leq 10^5$
### Input Format
- The first line contains an integer $T$ — the number of test cases.
- For each test case: The first line contains an integer $N$ — the number of nodes. The second line contains $N$ space-separated integers representing the node values ($0$, $1$, or $2$).
### Output Format
- For each test case: Print the sorted linked list in a single line (space-separated). If the linked list is empty, print -1.
### Sample 1:
Input
Output

```
3
7
2 1 0 1 2 0 1
0
5
2 2 0 1 0
```

```
0 0 1 1 1 2 2
-1
0 0 1 2 2
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T15:04:36.902Z  

```java
/* Node structure
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/
public static Node sortList(Node head) {
    Node d0=new Node(-1);
    Node d1=new Node(-2);
    Node d2=new Node(-3);
    
    Node t=head;
    Node t0=d0;
    Node t1=d1;
    Node t2=d2;
    
    while(t!=null){
        Node next=t.next;
        t.next=null;
        if(t.data==0){
            t0.next=t;
            t0=t;
        }
        else if(t.data==1){
            t1.next=t;
            t1=t;
        }
        else{
            t2.next=t;
            t2=t;
        }
        t=next;
    }
    t1.next=d2.next;
    t0.next=d1.next;
    
    
    return d0.next;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SORTLL012)