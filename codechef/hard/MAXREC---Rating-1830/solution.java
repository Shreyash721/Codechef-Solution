
import java.util.*;

class Codechef {

    // Find maximum rectangle area in a histogram
    private static int area(int[] h) {
        int n = h.length;

        int[] nse = new int[n];
        int[] pse = new int[n];

        Stack<Integer> st = new Stack<>();

        // 1. Find Next Smaller Element (NSE)
        for (int k = n - 1; k >= 0; k--) {

            while (!st.isEmpty() && h[st.peek()] >= h[k]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nse[k] = n;
            } else {
                nse[k] = st.peek();
            }

            st.push(k);
        }

        st.clear();

        // 2. Find Previous Smaller Element (PSE)
        for (int k = 0; k < n; k++) {

            while (!st.isEmpty() && h[st.peek()] >= h[k]) {
                st.pop();
            }

            if (st.isEmpty()) {
                pse[k] = -1;
            } else {
                pse[k] = st.peek();
            }

            st.push(k);
        }

        // 3. Calculate maximum rectangle area
        int max = 0;

        for (int k = 0; k < n; k++) {
            int width = nse[k] - pse[k] - 1;
            int currentArea = h[k] * width;

            max = Math.max(max, currentArea);
        }

        return max;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        // 4. Input the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int[] h = new int[n];
        int max = 0;

        // 5. Process each row as a histogram
        for (int i = 0; i < m; i++) {

            // Update histogram heights
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    h[j]++;
                } else {
                    h[j] = 0;
                }
            }

            // Find maximum area for this row
            max = Math.max(max, area(h));
        }

        System.out.println(max);
        sc.close();
    }
}
