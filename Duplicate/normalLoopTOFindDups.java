import java.util.*;
class DuplicateElement{
    void duplicate(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the string");
            String s = sc.nextLine();
            
            //corner case 
            if(s.isEmpty()){
                System.out.println("String is empty");
                return;
            }else{
                //comparing and traversing over string 
                for(int i = 0; i < s.length() -1; i++){
                    for(int j = i + 1; j < s.length(); j++){
                        if(s.charAt(i) == s.charAt(j)){
                            System.out.println("Duplicate element : " + s.charAt(i));
                        }
                    }
                }
            }
            //handling code 
        }catch(InputMismatchException e){
            System.out.println("ERROR ENCOUNTERED IN INPUT!");
            System.out.println(e.getMessage());
        }
    }
}
public class Main{
    public static void main(String [] args){
        //creating class obj and calling the method 
        DuplicateElement de = new DuplicateElement();
        de.duplicate();
    }
}
