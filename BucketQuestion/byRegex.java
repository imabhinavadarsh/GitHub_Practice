import java.util.*;
class BucketQuestion{
  //Declared Scanner
    Scanner sc = new Scanner(System.in);
  
//public mehtod which I am sharing to make the code concise
    public void ScannerToShare(){
        System.out.println("Enter the mix string");
    }
        //separate method of integer Bucket
    void integerBucket(){
        ScannerToShare();
        String s = sc.nextLine();
        String intBucket = s.replaceAll("[^0-9]","");
        System.out.println("Number Bucket :" + intBucket);
        }
  
        //separate method of alphabet Bucket
        void alphabetBucket(){
        ScannerToShare();
        String s = sc.nextLine();
        String alphaBucket = s.replaceAll("[^a-zA-Z]","");
        System.out.println("Alphabet Bucket" + alphaBucket);
        }
  
        //separate method of symbol Bucket
        void specialCharacterBucket(){
        ScannerToShare();
        String s = sc.nextLine();
        String specialCharBucket = s.replaceAll("[0-9a-zA-Z]","");
        System.out.println("SpecialChar Bucket :" + specialCharBucket);
        }

        //created a method which contains all the methods accoring to our need we can invoke the particular method 
        void mall(){
            integerBucket();
            alphabetBucket();
            specialCharacterBucket();
        }

    }
public class Main{
    public static void main(String [] args){
      //create a object of class BucketyQuestion and invoking mall method 
     BucketQuestion bq = new BucketQuestion();
     bq.mall();
    }
}
