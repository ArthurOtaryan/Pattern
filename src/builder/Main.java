package builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Builder ===");

        Pizza custom = Pizza.builder("XL")
                .dough("whole grain")
                .extraCheese()
                .topping("mushrooms")
                .topping("chicken")
                .build();
        System.out.println("  " + custom);

        PizzaDirector director = new PizzaDirector();
        System.out.println("  " + director.margherita());
        System.out.println("  " + director.pepperoni());

        try {
            Pizza.builder("S").build();
        } catch (IllegalStateException e) {
            System.out.println("  Validation error: " + e.getMessage());
        }
    }
}
