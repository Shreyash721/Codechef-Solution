# TWOSUMM

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chef and Pair of Elements

Chef has an array of integers $nums$.
He wants to invite two of his friends such that the  **sum of their lucky numbers equals a given target**  $X$.

Your task is to help Chef find the  **indices of the two numbers**  in the array whose sum is exactly $X$.

- Each input will have exactly one valid pair.
- You cannot use the same element twice.
- The index of the element that appears first in the array must be printed before the index of the element that appears later.
## Function Declaration
### Function Name

$findPair$ – Finds two indices of numbers in the array whose sum equals the target value.

### Parameters
- $nums$ : A list/array of integers.
- $target$ : An integer representing the required sum $X$.
### Return Value
- Returns the two indices of the numbers whose sum equals $target$. Answers are accepted on 0-based indexing.
## Constraints:
- $2 \leq nums.length \leq 10^4$
- $-10^9 \leq nums[i] \leq 10^9$
- $-10^9 \leq target \leq 10^9$ Only one valid answer exists.
### Input Format
- $N$ → size of array
- Next line → N integers (the array)
- Third line → target sum X
### Output Format

Print the two indices (0-based or 1-based depending on implementation; your samples use  **0-based**).

### Sample 1:
Input
Output

```
4
3 5 2 6
7

```

```
1 2

```

### Explanation:

1 index = 5
2 index = 2
5+2=7

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T18:20:53.655Z  

```java
public static int[] findPair(int[] nums, int target) {
    // Write your code here
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TWOSUMM)