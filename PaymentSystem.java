class Payment {

    public void processPayment(String creditCardNumber, String expiryDate) {
        System.out.println("Processing payment using Credit Card:");
        System.out.println("Credit Card Number: " + creditCardNumber);
        System.out.println("Expiry Date: " + expiryDate);
    }

    public void processPayment(String debitCardNumber, String expiryDate, int pin) {
        System.out.println("Processing payment using Debit Card:");
        System.out.println("Debit Card Number: " + debitCardNumber);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("PIN: " + pin);
    }

    public void processPayment(String upiId) {
        System.out.println("Processing payment using UPI:");
        System.out.println("UPI ID: " + upiId);
    }
}

class OnlinePayment extends Payment {

    @Override
    public void processPayment(String method) {
        System.out.println("Processing online payment using: " + method);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {

        Payment payment = new Payment();

        System.out.println("Method Overloading Demonstration:");
        payment.processPayment("1234-5678-9876-5432", "12/25");
        payment.processPayment("8765-4321-1234-5678", "11/24", 1234); 
        payment.processPayment("user@upi");

        OnlinePayment onlinePayment = new OnlinePayment();

        System.out.println("\nMethod Overriding Demonstration:");
        onlinePayment.processPayment("Credit Card");
    }
}