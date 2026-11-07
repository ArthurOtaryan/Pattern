package decorator;

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
    public String description() { return wrapped.description() + " + milk"; }

    @Override
    public double cost() { return wrapped.cost() + 0.50; }
}

class Syrup extends CoffeeDecorator {
    private final String flavor;

    Syrup(Coffee c, String flavor) {
        super(c);
        this.flavor = flavor;
    }

    @Override
    public String description() { return wrapped.description() + " + " + flavor + " syrup"; }

    @Override
    public double cost() { return wrapped.cost() + 0.70; }
}

class Cinnamon extends CoffeeDecorator {
    Cinnamon(Coffee c) { super(c); }

    @Override
    public String description() { return wrapped.description() + " + cinnamon"; }

    @Override
    public double cost() { return wrapped.cost() + 0.30; }
}
