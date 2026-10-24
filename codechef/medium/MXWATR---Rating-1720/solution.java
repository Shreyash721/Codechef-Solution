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
