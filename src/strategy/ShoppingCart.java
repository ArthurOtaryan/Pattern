package strategy;

import java.util.LinkedHashMap;
import java.util.Map;

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
            throw new IllegalStateException("No payment method selected");
        }
        double total = items.values().stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("  Items: " + items.keySet());
        paymentStrategy.pay(total);
    }
}
