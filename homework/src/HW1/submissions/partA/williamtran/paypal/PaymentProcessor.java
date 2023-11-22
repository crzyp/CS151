package HW1.submissions.partA.williamtran.paypal;

public class PaymentProcessor {
    private PayPalGateway payPalGateway;

    PaymentProcessor() {
        this.payPalGateway = new PayPalGateway();
    }

    void processPayment(Account account, double amount) {
        payPalGateway.processPayment(account,amount);
    }
}