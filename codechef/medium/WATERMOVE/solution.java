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
		    int [] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    if(n>2){
		        int s1=arr[0];
		        int s2=arr[1];
		        int max=arr[n-1];
		        int min=s1+s2;
		        max=Math.max(max,min);
		        System.out.println(max);
		    }
		    else{
		        System.out.println(arr[0]+arr[1]);
		    }
		}
	}
}
