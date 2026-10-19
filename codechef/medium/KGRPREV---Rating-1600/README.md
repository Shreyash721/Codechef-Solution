# KGRPREV - Rating 1600

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Reverse m size groups

You are given a linked list with $N$ nodes. You have to perform following commands -

- Make groups of size $M$ from the head node to the last node.
- Assuming $x$ groups are created, you have to reverse the order of nodes in each group.
- Relative order of the groups in the final linked list must remain the same i.e after reversing, all the elements of group $1$ should appear before group $2$ and so on.

In order to solve this problem, you just have to complete the function

Node *reverseMSizeGroups(Node*  head, int M) by returning the head node of the linked list

It is guaranteed that $N$ is divisible by $M$ for all test cases.

### Input Format
- First line will contain $T$, the number of testcases. Then the testcases follow.
- The first line of each test case contains 2 integers $N$ - length of linked list and $M$-group size
- Second line of each test case contains $N$ space separated integers $val_1, val_2,.... val_i,... val_n$ where $val_i$ is the value stored at ith node starting from the head node.

 **Note:** 

- For C++ language, you need to:

Complete the function in the submit solution tab:

```
Node *reverseMSizeGroups(Node*  head, int M)

```

$\$

### Output Format

Using the function you complete, for each testcase linked list generated must be the required linked list.

- For each test case N space separated integers $nval_1, nval_2,.., nval_i,... nval_N$ will be outputted, where $nval_i$ is the new value stored at ith node starting from the head node.
### Constraints
- $1 \leq T \leq 10^3$
- $1 \leq N \leq 10^5$
- $1 \leq M \leq 10^5$, $N$ is divisible by $M$
- $1 \leq val_i \leq 10^5$

Sum of $N$ over all test cases will not exceed 10^5

### Sample 1:
Input
Output

```
2
9 3
1 2 3 4 5 6 7 8 9
10 2
100 102 99 98 10 232 12 45 123 43
```

```
3 2 1 6 5 4 9 8 7
102 100 98 99 232 10 45 12 43 123

```

### Explanation:

 **Testcase 1**  : Given Linked List - 1 $\rightarrow$ 2 $\rightarrow$ 3 $\rightarrow$ 4 $\rightarrow$ 5 $\rightarrow$ 6 $\rightarrow$ 7 $\rightarrow$ 8 $\rightarrow$ 9

We need to make groups of 3 and reverse them. So, final linked list will be
3 $\rightarrow$ 2 $\rightarrow$ 1 $\rightarrow$ 6 $\rightarrow$ 5 $\rightarrow$ 4 $\rightarrow$ 9 $\rightarrow$ 8 $\rightarrow$ 7

 **Testcase 2**  : Given Linked List - 100 $\rightarrow$ 102 $\rightarrow$ 99 $\rightarrow$ 98 $\rightarrow$ 10 $\rightarrow$ 232 $\rightarrow$ 12 $\rightarrow$ 45 $\rightarrow$ 123 $\rightarrow$ 43

We need to make groups of 2 and reverse them. So, final linked list will be
102 $\rightarrow$ 100 $\rightarrow$ 98 $\rightarrow$ 99 $\rightarrow$ 232 $\rightarrow$ 10 $\rightarrow$ 45 $\rightarrow$ 12 $\rightarrow$ 43 $\rightarrow$ 123

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T07:19:31.453Z  

```c_cpp
/*struct Node {
	int val;
	struct Node* next;
	Node(int x){
		val = x;
		next = NULL;
	}
};*/ 


Node* reverseMSizeGroups(Node* head, int M) {
    if (head == NULL || M <= 1) {
        return head;
    }

    Node* curr = head;
    Node* prev = NULL;
    Node* next = NULL;
    int count = 0;

    // Reverse M nodes
    while (curr != NULL && count < M) {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
        count++;
    }

    // Connect to the next reversed group
    head->next = reverseMSizeGroups(curr, M);

    return prev;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/KGRPREV)