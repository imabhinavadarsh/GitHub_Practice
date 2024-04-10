import java.util.ArrayList;

public class BuildMerchant {
    ArrayList<Merchant> build(){
        ArrayList<Merchant> listMerch = new ArrayList<>();
        Transaction tx1 = new Transaction(1,"Nagpur");
        Merchant merch1 = new Merchant("Abhinav",tx1);
        listMerch.add(merch1);
        Transaction tx2 = new Transaction(1001,"Goa");
        Merchant merch2 = new Merchant("RAJ",tx2);
        listMerch.add(merch2);
        return listMerch;
    }
}
