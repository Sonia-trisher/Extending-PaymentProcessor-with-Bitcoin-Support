package Polymorphism;

public class GooglePay {
    private double amount;
    private String accountId;

    public GooglePay(double amount, String accountId) {
        this.amount = amount;
        this.accountId = accountId;
    }
    public double getAmount() {
        return amount;

    }
    public String getAccountId() {
        return accountId;
    }
}
