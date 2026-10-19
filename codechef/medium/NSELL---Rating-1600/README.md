# NSELL - Rating 1600

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find Next Smaller value in Linked List

Chef gave you the $head$ of a linked list and challenged you to find the next smaller value for every node in the linked list. Can you solve the challenge?

 **Note:**  If for some value, there is no next smaller value then assume the next smaller value for this number to be $-1$.

### Input Format
- First-line will contain $T$, the number of test cases. Then the test cases follow.
- Each test case contains two lines of input.
- The first line of every test case contains an integer $N$ - the length of array.
- The second line of every test case contains $N$ integers - $A_1,A_2,..,A_N$ denoting the integers in the array.
- You don't need to read or print anything. Just complete the function nextSmallerValue() which takes the head of the linked list as input.
### Output Format

Return the head of the linked list which contains next smaller value for every node.

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
2
9 19
6
19 18 16 12 8 8
6
14 9 14 5 2 1

```

```
-1 -1 
18 16 12 8 -1 -1 
9 5 5 2 1 -1 

```

### Explanation:

 **Test Case 1:**  There is no next smaller value for both the elements.

 **Test Case 3:**  Next smaller values can easily be verified.

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T07:15:18.413Z  

```c_cpp
/*struct Node {
    int val;
    Node *next;
    Node() : val(0), next(nullptr) {}
    Node(int x) : val(x), next(nullptr) {}
    Node(int x, Node *n) : val(x), next(n) {}
  };
  */
class Solution {
public:
    Node* nextSmallerValue(Node* head) {
        vector<Node*> nodes;
        Node* curr = head;

        // Store all nodes
        while (curr != nullptr) {
            nodes.push_back(curr);
            curr = curr->next;
        }

        int n = nodes.size();
        vector<int> ans(n, -1);
        stack<int> st;

        // Find next smaller value from right to left
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && st.top() >= nodes[i]->val) {
                st.pop();
            }

            if (!st.empty()) {
                ans[i] = st.top();
            }

            st.push(nodes[i]->val);
        }

        // Update node values
        for (int i = 0; i < n; i++) {
            nodes[i]->val = ans[i];
        }

        return head;
    }
};
```

---

[View on CodeChef](https://www.codechef.com/problems/NSELL)