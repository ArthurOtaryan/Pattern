package abstractfactory;

/** Абстрактный продукт A. */
public interface Button {
    void render();
}

class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("  [Windows] Квадратная кнопка");
    }
}

class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("  [macOS] Скруглённая кнопка");
    }
}
