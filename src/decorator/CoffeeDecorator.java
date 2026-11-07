package decorator;

/** Базовый декоратор: хранит ссылку на оборачиваемый объект. */
public abstract class CoffeeDecorator implements Coffee {
    protected final Coffee wrapped;

    protected CoffeeDecorator(Coffee wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String description() { return wrapped.description(); }

    @Override
    public double cost() { return wrapped.cost(); }
}

class Milk extends CoffeeDecorator {
    Milk(Coffee c) { super(c); }

    @Override
    public String description() { return wrapped.description() + " + молоко"; }

    @Override
    public double cost() { return wrapped.cost() + 30; }
}

class Syrup extends CoffeeDecorator {
    private final String flavor;

    Syrup(Coffee c, String flavor) {
        super(c);
        this.flavor = flavor;
    }

    @Override
    public String description() { return wrapped.description() + " + сироп (" + flavor + ")"; }

    @Override
    public double cost() { return wrapped.cost() + 40; }
}

class Cinnamon extends CoffeeDecorator {
    Cinnamon(Coffee c) { super(c); }

    @Override
    public String description() { return wrapped.description() + " + корица"; }

    @Override
    public double cost() { return wrapped.cost() + 15; }
}
