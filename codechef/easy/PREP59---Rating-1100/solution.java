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
		    String s=sc.next();
		    Stack<Character> st=new Stack<>();
		    
		    for(int i=0;i<s.length();i++){
		        char ch=s.charAt(i);
		        
		        if(ch==')' && !st.isEmpty()){
		            
		            if(st.peek()=='(') st.pop();
		            
		        }
		        
		        else{
		            
		            st.push(s.charAt(i));
		        }
		    }
		    
		    if(st.isEmpty()) System.out.println("1");
		    else System.out.println("0");
		}
		
	}
}
