package abstractfactory;

public interface Button {
    void render();
}

class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("  [Windows] Square button");
    }
}

class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("  [macOS] Rounded button");
    }
}
