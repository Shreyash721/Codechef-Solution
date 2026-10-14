import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		
// 		if(A<B) System.out.println(3*A);
// 		else if(A==B) System.out.println(A+B);
		
		System.out.println(Math.min(A+B,3*A));
	}
}
