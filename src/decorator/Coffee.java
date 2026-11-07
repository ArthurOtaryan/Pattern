package decorator;

public interface Coffee {
    String description();
    double cost();
}

class Espresso implements Coffee {
    @Override
    public String description() { return "Espresso"; }

    @Override
    public double cost() { return 2.00; }
}
