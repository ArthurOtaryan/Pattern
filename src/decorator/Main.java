package decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Decorator ===");

        Coffee simple = new Espresso();
        print(simple);

        Coffee latte = new Milk(new Espresso());
        print(latte);

        Coffee special = new Cinnamon(new Syrup(new Milk(new Milk(new Espresso())), "карамель"));
        print(special);
    }

    private static void print(Coffee coffee) {
        System.out.printf("  %s = %.0f руб.%n", coffee.description(), coffee.cost());
    }
}
