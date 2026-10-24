
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] h = new int[n];

            for (int i = 0; i < n; i++) h[i] = sc.nextInt();

            long max = 0;
            int left = 0, right = n - 1;

            while (left < right) {
                long water = (long) Math.min(h[left], h[right]) * (right - left - 1);
                max = Math.max(max, water);

                if (h[left] < h[right]) left++;
                else right--;
            }

            System.out.println(max);
        }
        sc.close();
    }
}
