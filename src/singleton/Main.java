package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Singleton ===");

        AppConfig a = AppConfig.getInstance();
        AppConfig b = AppConfig.getInstance();
        a.set("theme", "dark");

        System.out.println("  a == b ? " + (a == b));
        System.out.println("  theme через b: " + b.get("theme"));

        Logger.INSTANCE.log("Приложение запущено");
        Logger.INSTANCE.log("Настройки загружены: " + a.get("app.name"));
    }
}
