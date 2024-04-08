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
      //set at index 
      al.set(1, 100);// 1 = index , 100 element
                System.out.println(al);
    }
}
