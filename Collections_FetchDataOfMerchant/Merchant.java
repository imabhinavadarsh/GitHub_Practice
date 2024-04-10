class Merchant {
   private int transaction;
    private String legalName;

    public Merchant(int transaction, String legalName) {
        this.transaction = transaction;
        this.legalName = legalName;
    }

    public int getTransaction() {
        return transaction;
    }

    public void setTransaction(int transaction) {
        this.transaction = transaction;
    }

    public String getLegalName() {
        return legalName;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "transaction=" + transaction +
                ", legalName='" + legalName + '\'' +
                '}';
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }
}
