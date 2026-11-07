package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Singleton ===");

        AppConfig a = AppConfig.getInstance();
        AppConfig b = AppConfig.getInstance();
        a.set("theme", "dark");

        System.out.println("  a == b ? " + (a == b));
        System.out.println("  theme via b: " + b.get("theme"));

        Logger.INSTANCE.log("Application started");
        Logger.INSTANCE.log("Settings loaded: " + a.get("app.name"));
    }
}
