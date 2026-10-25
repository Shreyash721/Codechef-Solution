# CONSECUTIVE - Rating 125000

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

### Longest Consecutive Numbers in an Array

You are given an array $nums$ containing integers.

Your task is to find the  **size of the largest subset of consecutive integers**. The order of elements in the original array does not matter — they can be rearranged to form the consecutive sequence. The test cases may contain duplicate values.

## Function Declaration
### Function Name

$longestConsecutive$ – This function returns the length of the longest sequence of consecutive integers in the array.

### Parameters
- $nums$ : An array of integers (may contain duplicates and negative values).
### Return Value
- Returns a single integer — the length of the longest consecutive integer sequence.
## Constraints
- $1 \leq nums.length \leq 10^5$
- $−10^9 \leq nums[i] \leq 10^9$
- Duplicate values may exist

 **The input and output formats provided below are only for testing with custom inputs. You only need to return the value. Printing is handled automatically.** 

### Input Format
- The first line of input contains a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input: The first line of each test case contains a single integer $N$ — the number of elements in the array. The next line contains $N$ space-separated integers $nums[i]$ — the elements of the array.
### Output Format
- For each test case, print a single integer — the size of the longest consecutive sequence.
### Sample 1:
Input
Output

```
3
5
15 12 14 16 13
7
50 3 2 1 4 9 6
6
100 300 101 103 102 105

```

```
5
4
4

```

### Explanation:
- For the first test case the longest run of consecutive numbers is [12, 13, 14, 15, 16], which has length 5.
- For the second test case the longest consecutive sequence is [1, 2, 3, 4], giving us length 4.
- For the third test case the longest consecutive group is [100, 101, 102, 103].

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T02:30:08.141Z  

```java
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;
            if((nums[i] - nums[i-1])==1){
                c++;
            }
            else{
               max=Math.max(c,max);
               c=1;
            }
        }
        
        max=Math.max(max,c);
        return max;
        
        
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/CONSECUTIVE)