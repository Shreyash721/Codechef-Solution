# SRTLL - Rating 1800

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sort a linked list

You are given a linked list.
Your task is to sort the linked list in ascending order.

 **Note** :

- Input is already handled
- You only need to complete the function rearrange
### Input Format
- First-line will contain $T$, the number of test cases. Then the test cases follow.
- Each test case contains two lines of input.
- The first line of every test case contains an integer $N$ - the length of array.
- The second line of every test case contains $N$ integers - $A_1,A_2,..,A_N$ denoting the integers in the linked list.
- You don't need to read or print anything. Just complete the function sort() which takes the head of the linked list as input.
### Output Format

Return the head of the sorted linked list.

### Constraints
- $1\leq T \leq 1000$
- $1 \leq N \leq 10^5$
- $1 \leq A_i \leq 10^9$
- $\sum N \leq 5 \cdot 10^5$
### Subtasks
- 30 points :$1 \leq N \leq 10^3$,$\sum N \leq 5 \cdot 10^3$
- 70 points : Original Constraints
### Sample 1:
Input
Output

```
3
1
1
3
5 2 7
4
4 1 2 2
```

```
1
2 5 7
1 2 2 4
```

### Explanation:

 **Test Case 1:**  The is only a single value in the entire linked list

 **Test Case 3:**  It is easy to see that the linked list after sorting is $[1, 2, 2, 4]$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T07:21:50.420Z  

```java
class Solution {
    public Node rearrange(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the linked list
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split the list into two halves
        Node second = slow.next;
        slow.next = null;

        // Sort both halves
        Node left = rearrange(head);
        Node right = rearrange(second);

        // Merge the sorted halves
        return merge(left, right);
    }

    private Node merge(Node left, Node right) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }

            tail = tail.next;
        }

        // Attach remaining nodes
        if (left != null) {
            tail.next = left;
        } else {
            tail.next = right;
        }

        return dummy.next;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SRTLL)