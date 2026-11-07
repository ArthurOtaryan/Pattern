package builder;

/** Директор знает готовые «рецепты» сборки. */
public class PizzaDirector {
    public Pizza margherita() {
        return Pizza.builder("M").topping("томаты").topping("моцарелла").build();
    }

    public Pizza pepperoni() {
        return Pizza.builder("L").dough("толстое").extraCheese().topping("пепперони").build();
    }
}
