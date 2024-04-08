import java.util.*;
public class Main{
    public static void main(String[]args){
        String s = ("fsdfaASDADafF");
        int firstHalf  = (s.length()/2);
        String firstModification = s.substring(0, firstHalf);
        System.out.println(firstModification.toUpperCase());
        int secondHalf = (s.length());
        String secondModification = s.substring(firstHalf, secondHalf);
        System.out.println(secondModification.toLowerCase());
    }
}
