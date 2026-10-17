# PREP21 - Rating 1200

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Evaluate Expression

You are given a string $S$ consisting of $N$ characters. Each character is either a digit from $0$ to $9$ or an operator out of `+`, `-`, and `*`.

Consider the string to be in reverse polish notation consisting of  **digits**  (from $1$ to $9$) as the operands and `+`, `-`, or `*` as the operators and evaluate the expression.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line of each test case contains a single integer $N$ — the number of characters in the string. The next line consists of $N$ characters, where the $i^{th}$ character is either a digit from $0$ to $9$ or an operator out of +, -, and *. Consider the string to be in reverse polish notation.
### Output Format

For each test case, output on a new line, an integer denoting the evaluated expression.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 10^5$
- The sum of $N$ over all test cases won't exceed $2\cdot 10^5$.
### Sample 1:
Input
Output

```
4
3
73-
7
04 *3* 0-
3
27*
7
703*-9-

```

```
4
0
14
-2

```

### Explanation:

 **Test case $1$:**  The postfix expression corresponds to $7-3$ which is equal to $4$.

 **Test case $2$:**  The postfix expression corresponds to $((0\times 4)\times 3) - 0)$ which is equal to $0$.

 **Test case $3$:**  The postfix expression corresponds to $2\times 7$ which is equal to $14$.

 **Test case $4$:**  The postfix expression corresponds to $(7 - (0\times 3)) - 9)$ which is equal to $-2$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T11:42:47.367Z  

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
		    String s=sc.next();
		    Stack<Integer> st=new Stack<>();
		    
		    for(int i=0;i<n;i++){
		        char ch=s.charAt(i);
		        if(Character.isDigit(ch)){
		            st.push(ch-'0');
		        }
		        else{
		            int a=st.pop();
		            int b=st.pop();
		            if(ch=='+'){
		                st.push(a+b);
		            }
		            else if(ch=='-'){
		                st.push(b-a);
		            }
		            else if(ch=='*'){
		                st.push(a*b);
		            }
		        }
		    }
		    System.out.println(st.peek());
		    
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PREP21)