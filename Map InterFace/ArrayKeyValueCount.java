import java.util.*;
public class Main{
    public static void main(String [] args){
        int [] a =  { 1,1,1,1,23,4,35,346,36,6,56,36,3};
        HashMap<Integer, Integer> IntMap = new HashMap<>();
        for(int c : a){
            if(IntMap.containsKey(c)){
                IntMap.put(c, IntMap.get(c)+1);
            }else{
                IntMap.put(c, 1);
            }
        }
        System.out.println(IntMap);
    }
}
