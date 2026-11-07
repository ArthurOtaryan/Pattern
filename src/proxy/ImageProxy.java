package proxy;

import java.util.Set;

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
            System.out.println("  [Proxy] Access denied for role '" + role + "'");
            return;
        }
        if (realImage == null) {
            realImage = new RealImage(fileName);
        } else {
            System.out.println("  [Proxy] Using cached image: " + fileName);
        }
        realImage.display();
    }
}
