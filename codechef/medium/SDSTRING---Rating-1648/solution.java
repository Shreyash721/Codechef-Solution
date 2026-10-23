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
		    int c1=0,c0=0;
		    String s=sc.next();
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='1') c1++;
		        else c0++;
		        
		    }
		    if(s.length()%2!=0 || c1==0 ||c0==0) System.out.println("-1");
		    else System.out.println(Math.abs(c1-c0)/2);
		}

	}
}
