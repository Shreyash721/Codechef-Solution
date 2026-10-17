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
		    String s=sc.next();
		    Stack<Integer> st=new Stack<>();
		    
		    for(int i=0;i<n;i++){
		        char ch=s.charAt(i);
		        if(Character.isDigit(ch)){
		            st.push(ch-'0');
		        }
		        else{
		            int a=st.pop();
		            int b=st.pop();
		            if(ch=='+'){
		                st.push(a+b);
		            }
		            else if(ch=='-'){
		                st.push(b-a);
		            }
		            else if(ch=='*'){
		                st.push(a*b);
		            }
		        }
		    }
		    System.out.println(st.peek());
		    
		}
	}
}
