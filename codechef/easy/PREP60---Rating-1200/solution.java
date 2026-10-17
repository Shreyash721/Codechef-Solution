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
	       Stack<Integer> st=new Stack<>();
	       int [] ans=new int[n];
	       for(int i=0;i<n;i++){
	           int ch=sc.nextInt();
	           while(!st.isEmpty() && st.peek()>ch){
	               st.pop();
	           }
	           if(st.isEmpty()){
	               ans[i]=-1;
	           }
	           else{
	               ans[i]=st.peek();
	           }
	           st.push(ch);
	       }
	       for(int i=0;i<n;i++){
	         System.out.print(ans[i]+" ");
	      }
	      System.out.println();
	   }
	   
	 
	}
}
