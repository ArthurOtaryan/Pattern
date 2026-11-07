package abstractfactory;

public interface Checkbox {
    void render();
}

class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("  [Windows] Square checkbox [x]");
    }
}

class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("  [macOS] Round checkbox (o)");
    }
}
