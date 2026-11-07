package proxy;

import java.util.Set;

/**
 * Заместитель:
 *  - ленивая загрузка (virtual proxy): RealImage создаётся только при первом показе;
 *  - контроль доступа (protection proxy): проверка прав пользователя.
 */
public class ImageProxy implements Image {
    private static final Set<String> ALLOWED_ROLES = Set.of("admin", "user");

    private final String fileName;
    private final String role;
    private RealImage realImage;

    public ImageProxy(String fileName, String role) {
        this.fileName = fileName;
        this.role = role;
    }

    @Override
    public void display() {
        if (!ALLOWED_ROLES.contains(role)) {
            System.out.println("  [Proxy] Доступ запрещён для роли '" + role + "'");
            return;
        }
        if (realImage == null) {
            realImage = new RealImage(fileName);
        } else {
            System.out.println("  [Proxy] Берём из кэша: " + fileName);
        }
        realImage.display();
    }
}
