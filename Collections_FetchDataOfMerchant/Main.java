import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        BuildMerchant bm = new BuildMerchant();
        ArrayList<Merchant> merchList = bm.build();
        for(Merchant c : merchList){
            System.out.println(c.getTransaction() + " = " + c.getLegalName());
        }
    }
}
