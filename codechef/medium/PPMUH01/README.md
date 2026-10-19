# PPMUH01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chef Builds Queue Using Stacks

Chef wants to implement a queue that follows the  **First-In-First-Out (FIFO)**  principle using only  **two stacks**.
Stacks support operations such as  **push**,  **pop**,  **peek**,  **size**, and  **isEmpty**.

Chef needs to design a queue using only stack operations such that it behaves exactly like a normal queue and each operation runs in  **amortized $O(1)$ time**.

## Class Description

Chef will implement a class named  **$QueueUsingStacks$**. The class supports the following operations:

- $pushElement(x)$ Inserts the element $x$ at the back of the queue.
- $popElement()$ Removes and returns the front element of the queue.
- $peekElement()$ Returns the front element of the queue without removing it.
- $isEmptyResult()$ Returns true if the queue is empty, otherwise returns false.
## Constraints
- $1 \le T \le 10^5$
- $1 \le N \le 2 \times 10^5$
- $1 \le x \le 10^9$
- The total number of operations across all test cases will not exceed $10^6$
- All $popElement()$ and $peekElement()$ operations are guaranteed to be valid
### Input Format
- The first line contains an integer $T$ — the number of test cases.
- For each test case: The first line contains an integer $N$ — the number of operations. The next $N$ lines contain one of the following operations: push x pop peek empty
### Output Format
- For each test case, print the result of each operation on a new line.
- For $popElement()$ and $peekElement()$, print the integer value.
- For $isEmptyResult()$, print true if the queue is empty, otherwise print false.
- For $pushElement(x)$, print None.
### Sample 1:
Input
Output

```
1
6
push 10
push 20
peek
pop
empty
pop
```

```
None
None
10
10
false
20
```

### Explanation:
- push 10: Added 10 to the queue, output None as push returns nothing.
- push 20: Added 20 to the queue, output None again.
- peek: Front element is 10, so output is 10.
- pop: Removed and returned front element 10.
- empty: Queue still has 20, so output is false.
- pop: Removed and returned 20, queue is now empty.
### Sample 2:
Input
Output

```
1
8
push 5
push 3
push 7
pop
peek
pop
pop
empty
```

```
None
None
None
5
3
3
7
true
```

### Explanation:
- push 5: Queue = [5], output None as push doesn't return value.
- push 3: Queue = [5, 3], output None.
- push 7: Queue = [5, 3, 7], output None.
- pop: Removes front 5, output 5. Queue = [3, 7].
- peek: Front is 3, output 3. Queue unchanged.
- pop: Removes front 3, output 3. Queue = [7].
- pop: Removes front 7, output 7. Queue = [].
- empty: Queue is empty, output true.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T09:26:43.412Z  

```java
class QueueUsingStacks {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    public void pushElement(int x) {
        st.push(x);
    }
    
    public int popElement() {
      if(st2.isEmpty()){
            while(!st.isEmpty()) st2.push(st.pop());
        }
        return st2.pop();
    }
    
    public int peekElement() {
        if(st2.isEmpty()){
            while(!st.isEmpty()) st2.push(st.pop());
        }
        return st2.peek();
    }
    
    public boolean isEmptyResult() {
        return st.isEmpty() && st2.isEmpty();
     }
}
    
```

---

[View on CodeChef](https://www.codechef.com/problems/PPMUH01)