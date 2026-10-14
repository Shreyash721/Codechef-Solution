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
	       long n=sc.nextLong();
	       long ans=0;
	       long i=2;
	       
	       while(i<=n){
	           long q=n/i;
	           long l=n/q;
	           
	           ans=ans+q*(l-i+1);
	           i=l+1;
	       }
	       
	       System.out.println(ans);
	   }
	   
	   sc.close();
	}
}
