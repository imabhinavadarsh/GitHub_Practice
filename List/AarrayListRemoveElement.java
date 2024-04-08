import java.util.*;
public class Main{
    public static void main(String[]args){
        ArrayList<Integer> al = new ArrayList<>();
        //Adding to an ArrayList
        al.add(10);
        al.add(20);
        al.add(9);
        al.add(5);
        System.out.println(al);
        al.remove(0);//index = 0
        al.remove(2);//index = 2
        System.out.println(al);

    }
}
