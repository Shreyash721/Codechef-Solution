# ROTLIST - Rating 1300

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Rotate the List

You are given the head of a singly linked list $A$ of length $N$. The values in the list are $A_1, A_2, \ldots, A_N$ respectively. You are also given a non-negative integer $R$. You need to rotate the list $R$ places to the right.

A single rotation to the right is an operation in which the last element of the list is moved to the first place in the list, while all the other elements are moved one place to the right.

### Input Format
- The first line of the input contains a single integer $T$ - the number of test cases. The description of $T$ test cases follows.
- The first line of each test case contains two space-separated integers $N$ and $R$.
- The second line of each test case contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$.

 **Note:** 

- For Java language, you need to:

Complete the function in the submit solution tab:

```
Node rotateRight(Node head, int R){...}

```

$\$

- For C++ language, you need to:

Complete the function in the submit solution tab:

```
Node *rotateRight(struct Node*  head, int R){...}

```

$\$

- For Python language, you need to:

Complete the function in the submit solution tab:

```
def rotateRight(head, R):

```

### Output Format
- For each test case, the function you complete should return the head of the list which has been rotated to the right exactly $R$ times.
### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 10^5$
- $0 \leq R \leq N-1$
- $1 \leq A_i \leq 10^9$ for each valid $i$
- the sum of $N$ over all test cases does not exceed $10^5$
### Sample 1:
Input
Output

```
3
4 1
1 2 3 4
5 3
4 7 3 1 6
6 5
7 2 2 2 2 2
```

```
4 1 2 3
3 1 6 4 7
2 2 2 2 2 7
```

### Explanation:

 **Example case 1:**  After rotating the list once, the order of the elements is $[4,1,2,3]$.

 **Example case 2:**  After rotating the list $R=3$ times, the order of the elements is $[3,1,6,4,7]$.

 **Example case 3:**  After rotating the list $R=5$ times, the order of the elements is $[2,2,2,2,2,7]$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T14:35:54.225Z  

```java
/*class Node{
    int val;
    Node next;
    Node(int x){
    	val = x; next = null;
    }
}*/

static Node rotateRight(Node head, int r){
    if(head==null || head.next==null || r==0) return head;
    Node t=head;
    int n=1;
    while(t.next!=null){
        t=t.next;
        n++;
    }
    
    r=r%n;
    if(r==0) return head;
    t.next=head;
    
    int steps=n-r;
    Node new1=head;
    while(steps-->1){
        new1=new1.next;
    }
    Node newhead=new1.next;
    new1.next=null;
    
    
    return newhead;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ROTLIST)