import java.util.*;

class countKeyValue{
    void countValue(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the String");
            String s = sc.nextLine();
            
            if(s.isEmpty()){
                System.out.println("String is Empty");
                return;
            }else{
                HashMap<Character, Integer> charMap = new HashMap<>();
                for(char c : s.toCharArray()){
                    if(charMap.containsKey(c)){
                        charMap.put(c, charMap.get(c)+1);
                    }else{
                        charMap.put(c,1);
                    }
                }
                System.out.println(charMap);
            }
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class Main{
    public static void main(String[] args){
        countKeyValue ckv = new countKeyValue();
        ckv.countValue();
    }
}
