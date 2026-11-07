package decorator;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Decorator ===");

        Coffee simple = new Espresso();
        print(simple);

        Coffee latte = new Milk(new Espresso());
        print(latte);

        Coffee special = new Cinnamon(new Syrup(new Milk(new Milk(new Espresso())), "caramel"));
        print(special);
    }

    private static void print(Coffee coffee) {
        System.out.printf(Locale.US, "  %s = $%.2f%n", coffee.description(), coffee.cost());
    }
}
