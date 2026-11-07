package abstractfactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Abstract Factory ===");

        String os = System.getProperty("os.name").toLowerCase();
        GUIFactory factory = os.contains("mac") ? new MacFactory() : new WindowsFactory();
        System.out.println("  Current OS: " + os);
        new Application(factory).paint();

        System.out.println("  -- same application with the macOS factory --");
        new Application(new MacFactory()).paint();
    }
}
