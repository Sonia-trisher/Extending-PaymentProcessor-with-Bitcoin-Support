package Polymorphism;

public class processPayment {

//    implementation here
    public void processPayment(Bitcoin bitcoin){
        System.out.println("Processing Bitcoin Payment with transaction id:" + bitcoin.getTransactionId() +" for amount: $" + bitcoin.getAmount());
    }
    public void processPayment(PayPal payPal){
        System.out.println("Processing Paypal Payment for amount: " + payPal.getAmount() +"with email: " + payPal.getEmail());
    }
    public void processPayment(CreditCard c){
        System.out.println("Processing Credit Card Payment for amount: " + c.getAmount());
    }
    public void processPayment(GooglePay g){
        System.out.println("Processing Google Payment for amount: " + g.getAmount() + " with account ID: " + g.getAccountId());

    }

        }
