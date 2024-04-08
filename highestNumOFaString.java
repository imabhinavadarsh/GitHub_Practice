import java.util.*;
import java.util.stream.*;
public class Main{
    public static void main(String[]args){
        int num = 1286;
        String s = String.valueOf(num);
        ArrayList<Character> al = new ArrayList<>();
        for(char c : s.toCharArray()){
            al.add(c);
        }
        System.out.println(al);
        List<Character> desc = al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for(char c : desc){
            sb.append(c);
        }
        int maxNum = Integer.parseInt(sb.toString());
        System.out.println(maxNum);
    }
}
