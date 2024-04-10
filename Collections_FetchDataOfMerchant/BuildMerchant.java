import java.util.ArrayList;

public class BuildMerchant {
    ArrayList<Merchant> build() {
        ArrayList<Merchant> listMerch = new ArrayList<>();
        listMerch.add(new Merchant(45, "Infosys"));
        listMerch.add(new Merchant(42, "qracle"));
        listMerch.add(new Merchant(45, "wipro"));
        listMerch.add(new Merchant(46, "tcs"));
        return listMerch;
    }
}
