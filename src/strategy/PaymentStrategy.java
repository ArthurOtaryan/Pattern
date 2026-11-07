package strategy;

/** Стратегия: общий интерфейс семейства алгоритмов оплаты. */
public interface PaymentStrategy {
    void pay(double amount);
}

class CardPayment implements PaymentStrategy {
    private final String maskedCard;

    CardPayment(String maskedCard) { this.maskedCard = maskedCard; }

    @Override
    public void pay(double amount) {
        System.out.printf("  Оплата картой %s: %.2f руб.%n", maskedCard, amount);
    }
}

class PayPalPayment implements PaymentStrategy {
    private final String email;

    PayPalPayment(String email) { this.email = email; }

    @Override
    public void pay(double amount) {
        System.out.printf("  Оплата через PayPal (%s): %.2f руб.%n", email, amount);
    }
}

class CryptoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        double fee = amount * 0.01;
        System.out.printf("  Оплата криптовалютой: %.2f руб. (+комиссия %.2f)%n", amount, fee);
    }
}
