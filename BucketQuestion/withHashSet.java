//Code for Duplicate not for BucketQuestion
import java.util.*;
class DuplicateRemoveHS{
    void duplicateHS(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a String");
            String s = sc.nextLine();
            
            if(s.isEmpty()){
                System.out.println("Empty String");
                return;
            }
            
            HashSet<Character> hs = new HashSet<>();
            for(char c : s.toCharArray()){
                hs.add(c);
            }
            System.out.println("Duplicate Removed :" + hs);
        }
        catch(InputMismatchException e){
            System.out.println("ERROR IN INPUT!" + e.getMessage());
        }
    }
}
public class Main{
    public static void main(String[] args){
        DuplicateRemoveHS dr = new DuplicateRemoveHS();
        dr.duplicateHS();
    }
}
