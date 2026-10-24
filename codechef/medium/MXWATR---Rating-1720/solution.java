import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int [] h = new int[n];
		    for(int i = 0; i < n; i++){
		        h[i] = sc.nextInt();
		    }
		    
		    int l = 0;
		    int r = n - 1;
		    int left = 0;
		    int right = 0;
		    
		    // Store trapped water at each index
		    int[] water = new int[n];
		    
		    while(l <= r){
		        left = Math.max(left, h[l]);
		        right = Math.max(right, h[r]);
		        if(left < right){
		            water[l] = left - h[l];
		            l++;
		        }
		        else{
		            water[r] = right - h[r];
		            r--;
		        }
		    }
		    
		    // Find the maximum water in a single continuous section
		    long maxSection = 0;
		    long currentSum = 0;
		    for(int i = 0; i < n; i++){
		        if(water[i] > 0){
		            currentSum += water[i];
		        } else {
		            maxSection = Math.max(maxSection, currentSum);
		            currentSum = 0;
		        }
		    }
		    maxSection = Math.max(maxSection, currentSum);
		    
		    System.out.println(maxSection);
		}
	}
}