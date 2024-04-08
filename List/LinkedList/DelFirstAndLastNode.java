//Q.) Delete first and last element of an array
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6, 7, 8};
        LinkedList<Integer> ll = new LinkedList<>();
        
        for (int c : a) {
            ll.add(c);
        }
        
        System.out.println("WITH FIRST & LAST NODE: " + ll);
        
        ll.removeFirst();
        ll.removeLast();
        
        System.out.println("AFTER REMOVALS: " + ll);
    }
}
