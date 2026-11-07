package proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Proxy ===");

        Image photo = new ImageProxy("photo_4k.png", "user");
        System.out.println("  Proxy created, image not loaded yet");
        photo.display();
        photo.display();

        Image secret = new ImageProxy("secret.png", "guest");
        secret.display();
    }
}
