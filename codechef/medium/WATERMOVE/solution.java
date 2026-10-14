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
		    int k=sc.nextInt();
		    
		    int[] arr=new int[n];
		   for(int i=0;i<n;i++){
		       arr[i]=sc.nextInt();
		   }
		   
		   if(n==2){
		       System.out.println(arr[0]+arr[1]);
		   }
		   else{
		   int f=0;
		   int l=n-2;
		   System.out.println(arr[f]+arr[l]);
		   }
		}
	}
}
