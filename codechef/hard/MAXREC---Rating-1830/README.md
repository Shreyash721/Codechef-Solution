# MAXREC - Rating 1830

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

### Maximum Area

Bob has a rectangle garden of size $N*M$ in the form of a grid. Bob was thinking of getting the grass in his garden cut, but due to some reason,grass hasn’t grown in some regions, anyhow he thinks of hiring a gardener Dumbu. Dumbu does the job free of cost but has some conditions:-

- Cuts only $1$ rectangle
- Rectangle has to be wholly filled with grass. Bob wants the maximum amount of grass to be cut. Help Bob find the maximum area of grass the Dumbu can cut.
### Input Format
- First line will contain 2 numbers N, M separated by a space.
- Next N lines contain M integers 0 or 1 separated by a space in each line.
### Output Format

Maximum Area that Dumbu can cut.

### Constraints
- $1 \leq N,M \leq 2000$
- grid[i][j] is either 0 signifying no grass or 1 sigifying grass.
### Subtasks
- 30 points : $1 \leq N,M \leq 200$
- 70 points : $1 \leq N,M \leq 2000$
### Sample 1:
Input
Output

```
2 2
1 0 
0 1

```

```
1
```

### Explanation:

Maximum are that Dumbu can cut is the square at (1,1) (0-based indexing)

### Sample 2:
Input
Output

```
4 5
1 0 0 0 0 
1 1 1 1 1 
1 0 0 1 1 
1 0 0 1 1

```

```
6
```

### Explanation:

Maximum are that dumbu can cut is the rectangle from (1,3) to (3,4) hence the area being 6.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T02:18:21.170Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int [][] grid=new int[m][n];
		int max=0;
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        grid[i][j]=sc.nextInt();
		    }
		}
		
		int [] h=new int[n];
		for(int i=0;i<m;i++){
		    
		    for(int j=0;j<n;j++){
		        if(grid[i][j]==1){
		            h[j]++;
		        }
		        else h[j]=0;
		    }
	    for(int j=0;j<n;j++){
		int min=h[j];
		for(int k=j;k<n;k++){
		        min=Math.min(min,h[k]);
		        int area=min*(k-j+1);
		        max=Math.max(max,area);
		    }
		}
	}
		
		System.out.println(max);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MAXREC)