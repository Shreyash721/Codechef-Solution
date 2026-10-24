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
		    int sum=0;
		    int max-0;
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    if(k>n) max=n;
		    else max=k;
		    Arrays.sort(arr);
		    int i=arr.length-max;
		    while(i<n && max>0){
		       sum = sum+arr[i];
		        i++;
		        max--;
		    }
		    
		    System.out.println(sum);
		    
		}

	}
}
