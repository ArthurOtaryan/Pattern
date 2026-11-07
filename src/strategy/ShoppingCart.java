package strategy;

import java.util.LinkedHashMap;
import java.util.Map;

/** Контекст: использует стратегию, не зная её конкретного класса. */
public class ShoppingCart {
    private final Map<String, Double> items = new LinkedHashMap<>();
    private PaymentStrategy paymentStrategy;

    public void add(String item, double price) {
        items.put(item, price);
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout() {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Не выбран способ оплаты");
        }
        double total = items.values().stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("  Товары: " + items.keySet());
        paymentStrategy.pay(total);
    }
}
