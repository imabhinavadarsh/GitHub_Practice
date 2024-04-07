import java.util.*;
class BucketQ{
    void bucket(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Input a mixed String!");
            String s = sc.nextLine();
            if(s.isEmpty()){
                System.out.println("Empty Bucket");
            }
            
            ArrayList<Character> digit = new ArrayList<>();
            ArrayList<Character> alpha = new ArrayList<>();
            ArrayList<Character> specialChar = new ArrayList<>();
            
            for(char c : s.toCharArray()){
                if(Character.isDigit(c)){
                    digit.add(c);
                }else if(Character.isAlphabetic(c)){
                    alpha.add(c);
                }else{
                    specialChar.add(c);
                }
            }
            
            System.out.println("Integer Bucket : " + digit);
            System.out.println("Alphabet Bucket : " + alpha);
            System.out.println("Symbol Bucket : " + specialChar);
        }catch(Exception e){
            System.out.println("Error in : " + e.getMessage());
        }
    }
}
public class Main{
    public static void main(String[] args){
        BucketQ bq = new BucketQ();
        bq.bucket();
    }
}
