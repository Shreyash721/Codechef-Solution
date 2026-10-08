# PALINLIST

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check if Linked List is Palindrome

Chef has been given a singly linked list containing integers.
He wants to check whether the given linked list forms a  **palindrome**  — i.e., it reads the same forwards and backwards.

Your task is to help Chef determine if the linked list is a palindrome.

## Function Declaration
### Function Name

$isPalindrome$ – This function checks whether a singly linked list is a palindrome.

### Parameters
- $head$ : A pointer to the head node of the singly linked list.
### Return Value
- Returns $true$ if the linked list is a palindrome.
- Returns $false$ otherwise.
## Constraints
- $1 \leq N \leq 10^5$, where $N$ is the number of nodes in the linked list.
- $0 \leq$ Value stored in each node $\leq 9$
- The linked list is singly linked

 *The input and output formats provided below are only for testing with custom inputs. You only need to complete the core logic function.* 

### Input Format
- The first line contains a single integer $N$ — the number of nodes in the linked list.
- The second line contains $N$ space-separated integers representing the values of the linked list nodes in order.
### Output Format
- Print $YES$ if the linked list is a palindrome.
- Otherwise, print $NO$.
### Sample 1:
Input
Output

```
5
1 2 3 2 1

```

```
YES

```

### Explanation:

In the first case, the list `1 -> 2 -> 3 -> 2 -> 1` reads the same backward.

### Sample 2:
Input
Output

```
4
1 2 3 4

```

```
NO

```

### Explanation:

In the second case, 1 -> 2 -> 3 -> 4 does not read the same backward.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T18:59:10.823Z  

```java
// Node structure used:
// class Node {
//     int val;
//     Node next;
//     Node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }
class Solution {
public boolean isPalindrome(Node head) {
    Node tail=head;
    Node node=null;
    while(tail!=null){
        Node n=new Node(tail.val);
        n.next=node;
        node=n;
        tail=tail.next;
    }
    
    while(head!=null && node!=null){
        if(head.val!=node.val) return false;
        head=head.next;
        node=node.next;
    }
    return true;
}
}
    

```

---

[View on CodeChef](https://www.codechef.com/problems/PALINLIST)