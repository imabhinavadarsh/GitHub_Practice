import java.util.*;
class RemoveDup{
    void removedup(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the string");
            String s = sc.nextLine();
            
            //corner case :
                
            if(s.isEmpty()){
                System.out.println("String is Empty");
            }
            
            if(s.length() == 1){
                System.out.println("No Duplicate Found! Only one element present: " + s);
            }
            
            System.out.println("String with Duplicates : " + s);
            
            //creating a HashSet and passing string to that HashSet
            
            HashSet<Character> hs = new HashSet<>();
            for(char c : s.toCharArray()){
                hs.add(c);
            }
            System.out.println("String wihtout Duplicates: " + hs);
        }
          catch(InputMismatchException e){
            System.out.println("Error in input : " + e.getMessage());
        }
    }
    
}
public class Main{
    public static void main(String[] args){
        RemoveDup rd = new RemoveDup();
        rd.removedup();
    }
}
