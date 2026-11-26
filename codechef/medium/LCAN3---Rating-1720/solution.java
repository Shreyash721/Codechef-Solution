
import java.util.*;

class Main {
    static class Node {
        int val;
        Node left, right;
        Node(int v) { val = v; }
    }

    static Node lca(Node r, int a, int b) {
        if(r == null || r.val == a || r.val == b) return r;
        Node l = lca(r.left, a, b), x = lca(r.right, a, b);
        return l != null && x != null ? r : (l != null ? l : x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            Node[] ar = new Node[n+1];
            for(int i=1; i<=n; i++) ar[i] = new Node(i);

            Node root = null;
            for(int i=0; i<n; i++) {
                int p=sc.nextInt(), c=sc.nextInt();
                if(p==-1) root=ar[c];
                else if(ar[p].left==null) ar[p].left=ar[c];
                else ar[p].right=ar[c];
            }

            int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
            System.out.println(lca(root, lca(root,a,b).val, c).val);
        }
    }
}
