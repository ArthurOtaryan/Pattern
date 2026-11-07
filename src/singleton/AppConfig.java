package singleton;

import java.util.HashMap;
import java.util.Map;

public final class AppConfig {
    private static volatile AppConfig instance;
    private final Map<String, String> settings = new HashMap<>();

    private AppConfig() {
        settings.put("app.name", "Pattern Demo");
        settings.put("app.version", "1.0");
        System.out.println("  [AppConfig] Single instance created");
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            synchronized (AppConfig.class) {
                if (instance == null) {
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }

    public String get(String key) {
        return settings.getOrDefault(key, "<none>");
    }

    public void set(String key, String value) {
        settings.put(key, value);
    }
}
