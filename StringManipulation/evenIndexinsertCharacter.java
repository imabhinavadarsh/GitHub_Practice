//Q> Set $ at even index of the string 
import java.util.*;
class EvenindexChar{
    void evenIndexChar(){
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.nextLine();
            
            if(s.isEmpty()){
                System.out.println("String is Empty");
                return;
            }
            //Logic
            StringBuilder sb = new StringBuilder(s);
            for(int i = 1; i < s.length(); i++){
                if(i%2==0){
                    sb.setCharAt(i,'$');
                    i++;
                }
            }
          
            System.out.println(sb.toString());
        }catch(InputMismatchException e){
            System.out.println("ERROR IN INPUT!" + e.getMessage());
        }
    }
}
public class Main{
    public static void main(String[]args){
        EvenindexChar eic = new EvenindexChar();
        eic.evenIndexChar();
    }
}
