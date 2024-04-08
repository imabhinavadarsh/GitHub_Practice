import java.util.*;
 public class Main{
     public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int[] a = new int[size];
         for(int i = 0; i < a.length; i++){
             a[i] = sc.nextInt();
         }
         //k'th Smallest
         
         ArrayList<Integer> al = new ArrayList<>();
         Arrays.stream(a).boxed().forEach(al::add);
         System.out.println(al);
         int kthMin = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
         System.out.println(kthMin);
     }
 }
