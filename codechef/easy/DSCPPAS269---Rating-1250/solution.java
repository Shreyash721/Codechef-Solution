import java.util.*;

public class Main {
    public static int[] nextHigherPeak(int[] heights) {
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int [] arr=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=heights[i]){
                    st.pop();
                
            }
            if(st.isEmpty()){
                arr[i]=-1;
            }
            else{
                arr[i]=st.peek();
            }
            st.push(heights[i]);
        }
        
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ht = new int[n];

        for (int i = 0; i < n; ++i) {
            ht[i] = sc.nextInt();
        }
        
        Stack<Integer> st=new Stack<>();
        int [] h=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=ht[i]){
                st.pop();
            }
            if(st.isEmpty()) h[i]=-1;
            else h[i]=st.peek();
            
            st.push(ht[i]);
        }
        
       for(int x:h){
           System.out.print(x+" ");
       } 
    }
}