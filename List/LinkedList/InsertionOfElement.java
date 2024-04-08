import java.util.*;
public class Main{
    public static void main(String[]args){
        LinkedList<Integer> ll = new LinkedList<>();
        //Adding to an ArrayList
        ll.add(10);
        ll.add(20);
        ll.add(9);
        ll.add(5);
        System.out.println(ll);
        //Performing insertion 
        ll.set(2, 89);
        //Here 2 is the index and element I am inserting
        System.out.println(ll);

    }
}
