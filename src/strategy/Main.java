package strategy;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Strategy ===");

        ShoppingCart cart = new ShoppingCart();
        cart.add("Keyboard", 45.00);
        cart.add("Mouse", 20.00);

        PaymentStrategy[] strategies = {
                new CardPayment("**** 1234"),
                new PayPalPayment("user@example.com"),
                new CryptoPayment(),
                amount -> System.out.printf(Locale.US, "  Paid in cash to the courier: $%.2f%n", amount)
        };

        for (PaymentStrategy strategy : strategies) {
            cart.setPaymentStrategy(strategy);
            cart.checkout();
        }
    }
}
