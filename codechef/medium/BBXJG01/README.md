# BBXJG01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chef Builds Stack

Chef wants to implement a stack that follows the  **Last-In-First-Out (LIFO)**  principle using only  **two queues**.
 **Queues**  support operations such as  **push to back**,  **pop or peek from front**,  **size**, and  **isEmpty**.
Chef needs to design a stack using only queue operations such that it behaves  **exactly like a normal stack**.

### Class Description

Chef will implement a class named  **$StackUsingQueues$**.

The class supports the following operations:

- $push(x)$ Pushes the element $x$ onto the top of the stack.
- $pop()$ Removes and returns the top element of the stack.
- $top()$ Returns the top element of the stack without removing it.
- $empty()$ Returns true if the stack is empty, otherwise returns false.
### Constraints
- $1 \le T \le 10^5$ — number of test cases For each test case: At most $100$ operations will be performed.
- For each push operation: $1 \le x \le 10^9$
- All $pop()$ and $top()$ operations are guaranteed to be valid.
### Input Format

The first line contains a single integer  **$T$**  — the number of test cases.
For each test case:

- A sequence of operations is performed on the stack.
- Each operation is one of the following: push $x$ pop top empty
### Output Format

For each operation that produces a result, print the output on a new line.

- For $pop()$ and $top()$, print the integer value.
- For $empty()$, print true if the stack is empty, otherwise print false.
- For $push(x)$, print None.
### Sample 1:
Input
Output

```
2
4
push 1
push 2
pop
top
3
push 9
pop
empty
```

```
None
None
2
1
None
9
true
```

### Explanation:
### For Test Case 1:
- push 1: Stack becomes [1], output None
- push 2: Stack becomes [1, 2], output None
- pop: Stack becomes [1], output 2
- top: Stack remains [1], output 1
### For Test Case 2:
- push 9: Stack becomes [9], output None
- pop: Stack becomes [] (empty), output 9
- empty: Stack is empty, output true

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T08:58:17.910Z  

```java
class StackUsingQueues {
    Queue<Integer> q=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    public void push(int x) {
        q2.add(x);
        while(!q.isEmpty()){
            q2.add(q.poll());
        }
        Queue<Integer> temp=q;
        q=q2;
        q2=temp;
    }
    
    public int pop() {
       return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
       return q.isEmpty();
    }
    
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BBXJG01)