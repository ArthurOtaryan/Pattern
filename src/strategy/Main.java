package strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Strategy ===");

        ShoppingCart cart = new ShoppingCart();
        cart.add("Клавиатура", 3500);
        cart.add("Мышь", 1500);

        PaymentStrategy[] strategies = {
                new CardPayment("**** 1234"),
                new PayPalPayment("user@example.com"),
                new CryptoPayment(),
                amount -> System.out.printf("  Оплата наличными курьеру: %.2f руб.%n", amount) // лямбда тоже стратегия
        };

        for (PaymentStrategy strategy : strategies) {
            cart.setPaymentStrategy(strategy); // меняем алгоритм во время выполнения
            cart.checkout();
        }
    }
}
