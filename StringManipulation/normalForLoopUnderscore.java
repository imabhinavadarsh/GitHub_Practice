import java.util.*;
class UppercaseUnderscore{
    void uppercaseUnderscore(){
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.nextLine();
            int count = 0;
            
            if(s.isEmpty()){
                System.out.println("String is Empty");
                return;
            }
            
            StringBuilder sb = new StringBuilder(s);
            for(int i = 1; i < s.length(); i++){
                if(Character.isUpperCase(s.charAt(i))){
                    sb.insert(i +count,'_');
                    count++;
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
        UppercaseUnderscore ucu = new UppercaseUnderscore();
        ucu.uppercaseUnderscore();
    }
}
