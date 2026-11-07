package decorator;

/** Компонент. */
public interface Coffee {
    String description();
    double cost();
}

/** Базовый конкретный компонент. */
class Espresso implements Coffee {
    @Override
    public String description() { return "Эспрессо"; }

    @Override
    public double cost() { return 120; }
}
