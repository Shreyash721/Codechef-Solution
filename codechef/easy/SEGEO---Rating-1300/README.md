# SEGEO - Rating 1300

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Separate Even and Odd values in a linked list

Chef has a linked list. He wants to modify the linked list such that all the even values appear before the odd values without changing their relative order. But he's too busy now and asked you to do the job for him.

Can you do it?

### Input Format
- First-line will contain $T$, the number of test cases. Then the test cases follow.
- Each test case contains two lines of input.
- The first line of every test case contains an integer $N$ - the length of array.
- The second line of every test case contains $N$ integers - $A_1,A_2,..,A_N$ denoting the integers in the linked list.
- You don't need to read or print anything. Just complete the function rearrange() which takes the head of the linked list as input.
### Output Format

Return the head of the linked list after rearrangement.

### Constraints
- $1 \leq T \leq 10^3$
- $1 \leq N \leq 10^5$
- $1 \leq A_i \leq 10^9$
- $\sum N \leq 5 \cdot 10^5$
### Sample 1:
Input
Output

```
3
3
1 2 3
4 
1 7 6 8
4
2 1 4 3
```

```
2 1 3
6 8 1 7
2 4 1 3
```

### Explanation:

 **Test Case 1:**  It is easy to see that the linked list after rearrangement will be $[2, 1, 3]$

 **Test Case 2:**  It is easy to see that the linked list after rearrangement will be $[6, 8, 1, 7]$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T14:19:19.196Z  

```java
class Solution {
    public Node rearrange(Node head) {
        
        if(head==null || head.next==null) return head;
        Node odddummy=new Node(-1);
        Node evendummy=new Node(-2);
        
        Node odd=odddummy;
        Node even=evendummy;
        Node t=head;
        
        while(t!=null){
            Node next=t.next;
            t.next=null;
            
            if(t.val%2==0){
                even.next=t;
                even=t;
            }
            else{
                odd.next=t;
                odd=t;
            }
            t=next;
        }
        even.next=odddummy.next;
        
        return evendummy.next;
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/SEGEO)