import java.util.*;
class OccurenceCount{
    void countOccurence(){
        try(Scanner sc = new Scanner(System.in)){
            int count = 0;
            System.out.println("Enter the string");
            String s = sc.nextLine();
            
            if(s.isEmpty()){
                System.out.println("Empty String");
                return;
            }
            
            System.out.println("Enter the key to find occurence");
            char key = sc.next().charAt(0);
            
            for(int i = 0; i < s.length(); i++){
                if(key == s.charAt(i)){
                    count = count + 1;
                }
            }
            double percentageOcc = ((double)count/s.length())*100;
            System.out.println("Occurence of:" + " " + key +" "+ "is :" + count);
            System.out.println("Occurence % of :" + key + " " +"is :" +  percentageOcc);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class Main{
    public static void main(String [] args){
        OccurenceCount oc = new OccurenceCount();
        oc.countOccurence();
    }
}
