public class Merchant {
    private String legalName;
    private Transaction transaction;

    @Override
    public String toString() {
        return "Merchant{" +
                "legalName='" + legalName + '\'' +
                ", transaction=" + transaction +
                '}';
    }

    public Merchant(String legalName, Transaction transaction) {
        this.legalName = legalName;
        this.transaction = transaction;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
