# MXWATR - Rating 1720

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Maximum water in a section

Chef owns a swimming pool with width $N$ meters which contains $N$ continuous walls with height $h_i$ (possible zero) and width $1$ meter each.

When it rains heavily, water is stored in the swimming pool in the form of sections (check Figure 1). Chef is busy calling his friends for a party. So, you need to determine the maximum water stored in  **a section**  among all the sections after a heavy rain.

Figure 1 :

This swimming pool has 3 sections :

- Section 2 has the maximum water i.e 10 units.
- Section 1 has 9 units of water.
- Section 3 contains 2 units of water.

So, the answer would be 10 units (maximum of all the sections)

### Input Format
- First line will contain $T$, number of testcases. Then the testcases follow.
- First line of each testcase contains an integer $N$ - number of walls $A$.
- Second line contains N space separated integers $h_1, h_2,....., h_N$
### Output Format

For each testcase, output one integer in a single line - Maximum water stored among all sections.

### Constraints
- $1 \leq T \leq 10^3$
- $2 \leq N \leq 10^5$
- $0 \leq h_i \leq 10^6$

Sum of $N$ over all test cases will not exceed $10^5$

### Subtasks
- 30 points : $2 \leq N \leq 500, \sum N_i \leq 500$
- 70 points : Original Constraints
### Sample 1:
Input
Output

```
2
4
5 0 2 6
6
3 1 4 0 3 5 
```

```
8
5
```

### Explanation:

 **Test Case 1**  : ![Test Case 1](https://s3.amazonaws.com/codechef_shared/download/Images/Aman/Copy+of+Test+Case+1.png =200x300)

This swimming pool has only 1 section with 8 units of water.

 **Test Case 2**  : ![Test Case 2](https://s3.amazonaws.com/codechef_shared/download/Images/Aman/Copy+of+Test+Case+2.png =300x300)

This swimming pool has 2 sections :

- Section 1 has 2 units of water.
- Section 2 has maximum water i.e 5 units.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T04:02:37.253Z  

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
		    int n=sc.nextInt();
		    int [] h=new int[n];
		    for(int i=0;i<n;i++){
		        h[i]=sc.nextInt();
		    }
		    
		    int l=0;
		    int r=n-1;
		    int left=0;
		    int right=0;
		    int ans=0;
		    while(l<r){
		        left=Math.max(left,h[l]);
		        right=Math.max(right,h[r]);
		        if(left<right){
		            ans=ans+(left-h[l]);
		            l++;
		        }
		        else{
		            ans=ans+(right-h[r]);
		            r--;
		        }
		    }
		    System.out.println(ans);
		}
		
		

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MXWATR)