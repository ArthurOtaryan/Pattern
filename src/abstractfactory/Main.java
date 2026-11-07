package abstractfactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Abstract Factory ===");

        String os = System.getProperty("os.name").toLowerCase();
        GUIFactory factory = os.contains("mac") ? new MacFactory() : new WindowsFactory();
        System.out.println("  Текущая ОС: " + os);
        new Application(factory).paint();

        System.out.println("  -- то же приложение с фабрикой macOS --");
        new Application(new MacFactory()).paint();
    }
}
