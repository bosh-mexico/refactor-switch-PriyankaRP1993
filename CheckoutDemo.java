public class CheckoutDemo {

    // Enum for Payment Modes
    enum PaymentMode {
        PAYPAL,
        GOOGLEPAY,
        CREDITCARD,
        UNKNOWN
    }

    // Checkout function
    public static void checkout(PaymentMode mode, double amount) {
        switch (mode) {
            case PAYPAL:
                System.out.println("Processing PayPal payment of $" + String.format("%.2f", amount));
                // Add PayPal-specific logic here
                break;

            case GOOGLEPAY:
                System.out.println("Processing GooglePay payment of $" + String.format("%.2f", amount));
                // Add GooglePay-specific logic here
                break;

            case CREDITCARD:
                System.out.println("Processing Credit Card payment of $" + String.format("%.2f", amount));
                // Add Credit Card-specific logic here
                break;

            default:
                System.out.println("Invalid payment mode selected!");
                break;
        }
    }

    // Main program
    public static void main(String[] args) {
        double amount = 150.75;

        checkout(PaymentMode.PAYPAL, amount);
        checkout(PaymentMode.GOOGLEPAY, amount);
        checkout(PaymentMode.CREDITCARD, amount);
        checkout(PaymentMode.UNKNOWN, amount);
    }
}