package HW1.submissions.partA.williamtran.paypal;

public class PayPalGateway {
    void processPayment(Account account, double amount) {
        System.out.println("Processing payment of $" + amount + " for acocunt " + account.getAccountID() + " using PayPal.");
    }
}
