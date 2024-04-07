import java.util.*;

public class Main{
public static void getString(String name){
  String upperStr = name.replaceAll("[^A-Z]","");
  String lowerStr = name.replaceAll("[^a-z]","");
  System.out.println("UpperCase count :" + upperStr.length() + " " + "LowerCase Count :" + lowerStr.length());
}

    public static void main(String[]args){ 
        getString("sadfddJHGHJFGHJjhghjhghj");
    }
}
