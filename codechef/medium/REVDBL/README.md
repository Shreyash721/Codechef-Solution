# REVDBL

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Reverse a Doubly Linked List

You are given a  **doubly linked list**  of integers. Your task is to  **reverse the list in-place**  and print the elements of the reversed list.

Here is the  **same style of function-declaration explanation**, rewritten for your  **reverse doubly linked list**  problem:

## Function Declaration
### Function Name

$reverseDLL$ — This function reverses the given doubly linked list by swapping the `next` and `prev` pointers of each node.

### Parameters

$head$: A pointer to the  **first node**  of the original doubly linked list.

- If head is NULL, the list is empty.
### Return Value

Returns a pointer to the  **new head**  of the doubly linked list after reversal.

- If the list is empty, returns NULL.

`The input and output formats provided below are only for testing with custom inputs.`

## Constraints:
- $1 \le T \le 100$
- $1 \le N \le 10^{6}$
- $0 \le \text{node.val} \le 10^{4}$
- $\textbf{Note: } \text{The sum of } N \text{ over all test cases will not exceed } 10^{6}.$
### Input Format

The first line contains an integer  **T**, the number of test cases.

For each test case:

- The first line contains an integer N, the number of nodes in the list.
- The second line contains N space-separated integers representing the values of the nodes from head to tail.
### Output Format

For each test case, print a single line containing  **N**  space-separated integers representing the reversed list.

### Sample 1:
Input
Output

```
3
4
5 15 25 35
2
100 200
1
42

```

```
35 25 15 5
200 100
42

```

### Explanation:

The input contains T = 3 test cases. For each test case, a doubly linked list is given and needs to be reversed. The list 5 15 25 35 becomes 35 25 15 5 after reversal. The list 100 200 becomes 200 100. The list 42 remains unchanged as it contains only one node. Thus, the reversed lists are printed for each test case.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T07:11:28.314Z  

```java
//class Main {

//    static class Node {
//        int data;
//      Node prev, next;
//        Node(int d) { data = d; }
//    }

static Node reverseDLL(Node head) {
    Node curr = head;
    Node temp = null;

    while (curr != null) {
        temp = curr.prev;
        curr.prev = curr.next;
        curr.next = temp;

        curr = curr.prev;
    }

    if (temp != null) {
        head = temp.prev;
    }

    return head;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/REVDBL)