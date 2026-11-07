package builder;

public class PizzaDirector {
    public Pizza margherita() {
        return Pizza.builder("M").topping("tomatoes").topping("mozzarella").build();
    }

    public Pizza pepperoni() {
        return Pizza.builder("L").dough("thick").extraCheese().topping("pepperoni").build();
    }
}
