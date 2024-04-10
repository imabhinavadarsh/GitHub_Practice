import java.util.ArrayList;

public class fetch {
    public static void main(String[] args) {
        BuildMerchant bm = new BuildMerchant();
        ArrayList<Merchant> listMerch  = bm.build();
        for(Merchant merchant : listMerch){
            System.out.println(merchant);
            String tx = merchant.getLegalName();
            System.out.println(tx);
            Transaction t = merchant.getTransaction();
            System.out.println(t.getTransID());
            System.out.println(t.getTrancLoc());

        }
    }
}
