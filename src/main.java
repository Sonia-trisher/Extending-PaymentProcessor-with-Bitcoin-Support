import Polymorphism.*;

public class main {
    public static void main(String[] args) {
        processPayment process = new processPayment();

        Bitcoin bitcoin = new Bitcoin(800.0,"tsklpt");
        PayPal payPal = new PayPal(10000.0,"uwamahorosonia1@gmail.com");
        CreditCard creditCard = new CreditCard(8000.0);
        GooglePay googlePay = new GooglePay(90000.0,"SSSS");

        process.processPayment(bitcoin);
        process.processPayment(payPal);
        process.processPayment(creditCard);
        process.processPayment(googlePay);
    }
}
