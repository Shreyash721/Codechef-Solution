import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Link list Node
class Node {
    int data;
    Node next;
    
    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {

    // Function to find intersection point in Y shaped Linked Lists
   public static int intersectPoint(Node head1, Node head2) {
    Node a = head1, b = head2;
    int n = 0, m = 0;

    while (a != null) { n++; a = a.next; }
    while (b != null) { m++; b = b.next; }

    a = head1;
    b = head2;

    while (n > m) { a = a.next; n--; }
    while (m > n) { b = b.next; m--; }

    while (a != b) {
        a = a.next;
        b = b.next;
    }

    return a == null ? -1 : a.data;
}

    // Function to take input and create a linked list
    public static Node inputList(int size, int[] v) {
        if (size == 0) return null;
        
        Node head = new Node(v[0]);
        Node tail = head;
        
        for (int i = 1; i < size; i++) {
            tail.next = new Node(v[i]);
            tail = tail.next;
        }
        
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = 1; // Number of test cases
        
        while (T-- > 0) {
            int n1 = scanner.nextInt(); // Size of the first list
            int n2 = scanner.nextInt(); // Size of the second list
            int n3 = scanner.nextInt(); // Size of the common list
            
            int p = (int) (Math.random() * 3); // Randomly decide which list contains the common part
            
            int[] v1 = new int[n1];
            int[] v2 = new int[n2];
            int[] v3 = new int[n3];
            
            for (int i = 0; i < n1; i++) v1[i] = scanner.nextInt();
            for (int i = 0; i < n2; i++) v2[i] = scanner.nextInt();
            for (int i = 0; i < n3; i++) v3[i] = scanner.nextInt();
            
            Node head1 = null;
            Node head2 = null;
            Node common = null;
            
            if (p == 0) {
                common = inputList(n3, v3);
                head1 = inputList(n1, v1);
                head2 = inputList(n2, v2);
            } else if (p == 1) {
                head1 = inputList(n1, v1);
                common = inputList(n3, v3);
                head2 = inputList(n2, v2);
            } else {
                head1 = inputList(n1, v1);
                head2 = inputList(n2, v2);
                common = inputList(n3, v3);
            }
            
            Node temp = head1;
            while (temp != null && temp.next != null)
                temp = temp.next;
            if (temp != null) temp.next = common;
            
            temp = head2;
            while (temp != null && temp.next != null)
                temp = temp.next;
            if (temp != null) temp.next = common;
            
            System.out.println(intersectPoint(head1, head2));
        }
        
        scanner.close();
    }
}