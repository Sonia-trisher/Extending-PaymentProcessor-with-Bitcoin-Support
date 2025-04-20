package Polymorphism;

public class PayPal {
    private double amount;
    private String email;

    public PayPal(double amount, String email) {
        this.amount = amount;
        this.email = email;
    }
    public double getAmount() {
        return amount;
    }
    public String getEmail() {
        return email;
    }
}
