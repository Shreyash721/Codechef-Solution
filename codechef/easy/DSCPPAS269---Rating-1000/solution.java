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
        int[] heights = new int[n];

        for (int i = 0; i < n; ++i) {
            heights[i] = sc.nextInt();
        }

        int[] result = nextHigherPeak(heights);

        for (int height : result) {
            System.out.print(height + " ");
        }
        System.out.println();
    }
}