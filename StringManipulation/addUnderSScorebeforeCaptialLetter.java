//set underScore just before uppercase in String with for each loop
import java.util.*;
class SetUnderscore{
    void setunderScore(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Input you String: ");
            String s = sc.nextLine();
            
            //corner case
            
            if(s.isEmpty()){
                System.out.println("Empty String!");
                return;
            }
            
            StringBuilder sb = new StringBuilder(s);
            for(char c : s.toCharArray()){
                if(Character.isUpperCase(c)){
                    sb.insert(sb.indexOf(Character.toString(c)),"_");
                }
            }
            System.out.println(sb);

    }catch(InputMismatchException e){
        System.out.println("Error in input!" + e.getMessage());
        }
    }
}
public class Main{
    public static void main(String [] args){
        SetUnderscore su = new SetUnderscore();
        su.setunderScore();
    }
}
