class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void processPayment() {
        System.out.println("Processing generic payment of ₹" + amount);
    }
}
class UPI extends OnlinePayment {
    String upiId;

    UPI(double amount, String transactionId, String upiId) {
        super(amount, transactionId);
        this.upiId = upiId;
    }

    void payUsingUPI() {
        System.out.println("Paying ₹" + amount + " using UPI ID: " + upiId);
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        UPI upiPayment = new UPI(750.50, "TXN12345", "user@upi");

        upiPayment.processPayment();           // from Payment
        upiPayment.validateOnlinePayment();    // from OnlinePayment
        upiPayment.payUsingUPI();              // from UPI
    }
}
