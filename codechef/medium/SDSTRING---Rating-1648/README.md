# SDSTRING - Rating 1648

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Self-Destructing Strings

A binary string is called a  *self-destructing string*  if it can reduced to an empty string by performing the following operation some number of times (possibly zero): Choose a valid integer $i$ such that the $i$-th character of the current string is different from the $i+1$-th character, and remove these two characters from the string.

You are given a binary string $s$. Your task is to convert $s$ to a self-destructing string. To do that, you may perform the following operation any number of times (possibly zero): Choose an integer $i$ ($1 \le i \le |s|-1$) such that the $i$-th character of $s$ is different from the $i+1$-th character, and invert one of these characters (inverting a character means changing '0' to '1' or '1' to '0', e.g. the string "01" can be changed to "00").

Find the smallest number of operations required to convert $s$ to a self-destructing string or determine that it is impossible.

### Input
- The first line of the input contains a single integer $T$ denoting the number of test cases. The description of $T$ test cases follows.
- The first and only line of each test case contains a single string $s$.
### Output

For each test case, print a single line containing one integer ― the smallest required number of operations or $-1$ if it is impossible to convert $s$ to a self-destructing string.

### Constraints
- $1 \le T \le 1,000$
- $1 \le |s| \le 10^6$
- $s$ contains only characters '0' and '1'
- the sum of $|s|$ over all test cases does not exceed $10^6$
### Sample 1:
Input
Output

```
3
001101
1101
110
```

```
0
1
-1
```

### Explanation:

 **Example case 1:**  We already have a self-destructing string because "0 **01** 101" can be converted to "0 **10** 1", to " **01** " and finally to an empty string.

 **Example case 2:**  We can choose $i=3$ (since $s_3 \neq s_4$) and then invert $s_4$ to obtain "1100", which is a self-destructing string.

 **Example case 3:**  It can be shown that "110" cannot be converted to a self-destructing string.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T17:52:11.703Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int c1=0,c0=0;
		    String s=sc.next();
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='1') c1++;
		        else c0++;
		        
		    }
		    if(s.length()%2!=0) System.out.println("-1");
		    else if(c1==c0) System.out.println("0");
		    else System.out.println(Math.abs(c1-c0)-1);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SDSTRING)