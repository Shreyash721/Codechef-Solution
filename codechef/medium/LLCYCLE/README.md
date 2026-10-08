# LLCYCLE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Detect Start of Cycle in Linked List

You are given a singly linked list with $N$ nodes. Each node contains an integer value.
Your task is to find the  **index of the node where a cycle begins**, if a cycle exists. If the linked list has no cycle, print $-1$.

A cycle occurs when a node's next pointer points to a  **previous node**  or  **itself**  in the list. The $pos$ is the 0-based index of the node that the last node points to.

## Function Declaration
### Function Name

$detectCycle$ — This function determines whether a cycle exists in a singly linked list and returns the index of the node where the cycle begins.

### Parameters

$head$: A pointer to the  **first node**  of the singly linked list.

- May be $NULL$ if the list is empty.
- Each node contains an integer value and a pointer to the next node.
### Return Value

Returns an integer representing the  **0-based index of the node**  where the cycle starts.

- If no cycle is present in the linked list, returns $-1$.

`The input and output formats provided below are only for testing with custom inputs.`

## Constraints:
- $0 \le N \le 10^{4}$
- $-10^{5} \le \text{Node.val} \le 10^{5}$
- $-1 \le \text{pos} < N$
### Input Format
- The first line contains an integer $N$ — the number of nodes in the linked list.
- The second line contains $N$ space-separated integers — the values of the nodes.
- The third line contains an integer $pos$ — the index that the last node connects to ($-1$ if no cycle).
### Output Format
- Print a single integer — the 0-based index of the node where the cycle begins.
- If there is no cycle, print $-1$.
### Sample 1:
Input
Output

```
7
11 22 33 44 55 66 77
4

```

```
4

```

### Explanation:

Linked list: `11 -> 22 -> 33 -> 44 -> 55 -> 66 -> 77`
The last node `77` points back to node at index `4` (`55`). Cycle starts at `55`.

### Sample 2:
Input
Output

```
5
3 6 9 12 15
1

```

```
1

```

### Explanation:

Linked list: `3 -> 6 -> 9 -> 12 -> 15` The last node `15` points to index `1` (`6`). Cycle starts at `6`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T16:22:41.164Z  

```java
// class Node {
//     int val;
//     Node next;
//     Node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }



public static int detectCycle(Node head) {
   Node slow=head;
   Node fast=head;
   int c=0;
   while(slow!=null && fast!=null && fast.next!=null){
       slow=slow.next;
       fast=fast.next.next;
       if(slow==fast){
           slow=head;
           while(slow!=fast){
               slow=slow.next;
               fast=fast.next;
               c++;
           }
           
           break;
       }
   }
   
    return c;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LLCYCLE)