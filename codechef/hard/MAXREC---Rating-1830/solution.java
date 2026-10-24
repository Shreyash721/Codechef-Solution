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
