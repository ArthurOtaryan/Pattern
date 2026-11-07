package strategy;

import java.util.Locale;

public interface PaymentStrategy {
    void pay(double amount);
}

class CardPayment implements PaymentStrategy {
    private final String maskedCard;

    CardPayment(String maskedCard) { this.maskedCard = maskedCard; }

    @Override
    public void pay(double amount) {
        System.out.printf(Locale.US, "  Paid by card %s: $%.2f%n", maskedCard, amount);
    }
}

class PayPalPayment implements PaymentStrategy {
    private final String email;

    PayPalPayment(String email) { this.email = email; }

    @Override
    public void pay(double amount) {
        System.out.printf(Locale.US, "  Paid via PayPal (%s): $%.2f%n", email, amount);
    }
}

class CryptoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        double fee = amount * 0.01;
        System.out.printf(Locale.US, "  Paid with crypto: $%.2f (+fee $%.2f)%n", amount, fee);
    }
}
