# MXSUBSUM - Rating 650

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Maximum Subset Sum

So let's try to solve a very basic problem first.

Given $N$ integers, you have to select a subset of these integers such that the sum of the subset is the largest compared to all other subsets.

Note that you might select an empty subset as well.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line of each test case contains $N$ - the number of integers The next line contains $N$ space separated integers, $i^{th}$ integer being $A_i$
### Output Format

For each test case, output on a new line the largest subset sum of the $N$ integers.

### Constraints
- $1 \leq T \leq 5 \cdot 10^{4}$
- $1 \leq N \leq 10^{5}$
- $-10^{4} \leq A_i \leq 10^{4}$
- Sum of $N$ over test cases do not exceed $10^{5}$
### Sample 1:
Input
Output

```
2
5
3 -2 1 3 0
4
-2 -3 -4 -1 
```

```
7
0
```

### Explanation:

 **Test Case 1**  - Select the elements 3, 1 and 3, so the total score would be 7.

 **Test Case 2**  - Select no elements, so the total score would be 0.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-16T12:06:30.675Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x > 0) {
                    sum += x;
                }
            }

            System.out.println(sum);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MXSUBSUM)