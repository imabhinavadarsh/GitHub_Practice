public class Transaction {
    int transID;
    String trancLoc;

    @Override
    public String toString() {
        return "Transaction{" +
                "transID=" + transID +
                ", trancLoc='" + trancLoc + '\'' +
                '}';
    }

    public Transaction(int transID, String trancLoc) {
        this.transID = transID;
        this.trancLoc = trancLoc;
    }

    public int getTransID() {
        return transID;
    }

    public void setTransID(int transID) {
        this.transID = transID;
    }

    public String getTrancLoc() {
        return trancLoc;
    }

    public void setTrancLoc(String trancLoc) {
        this.trancLoc = trancLoc;
    }
}
