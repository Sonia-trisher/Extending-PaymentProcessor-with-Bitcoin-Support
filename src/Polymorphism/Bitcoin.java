package Polymorphism;

public class Bitcoin {
    private double amount;
    private String transactionId;

    public Bitcoin(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }
    public double getAmount() {
        return amount;
    }
    public String getTransactionId() {
        return transactionId;
    }
}
