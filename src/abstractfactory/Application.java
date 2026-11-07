package abstractfactory;

/** Клиент работает только с интерфейсами фабрики и продуктов. */
public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.render();
        checkbox.render();
    }
}
