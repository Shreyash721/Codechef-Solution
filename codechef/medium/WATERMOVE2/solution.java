import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int max=0;
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    while(n>0){
		        int[] arr=sc.nextInt();
		    }
		    if(k>n) max=n;
		    Arrays.sort(arr);
		    int i=arr.length-max;
		    while(i<n && max>0){
		        int sum = sum+arr[i];
		        i++;
		        max--;
		    }
		    
		    System.out.println(sum);
		    
		}

	}
}
