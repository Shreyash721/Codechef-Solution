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
		    PriorityQueue<Integer> pq=new PriorityQueue<>();
		    for(int i=0;i<n;i++){
		        pq.add(sc.nextInt());
		    }
		   for(int i=0;i<k;i++){
		       int x=pq.poll();
		       int y=pq.poll();
		      pq.add(x+y);
		   }
		   int max=0;
		   while(!pq.isEmpty()){
		       max = Math.max()
		   }
		}
	}
}
