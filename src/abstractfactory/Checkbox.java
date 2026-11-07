package abstractfactory;

/** Абстрактный продукт B. */
public interface Checkbox {
    void render();
}

class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("  [Windows] Квадратный чекбокс [x]");
    }
}

class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("  [macOS] Круглый чекбокс (o)");
    }
}
