package proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Proxy ===");

        Image photo = new ImageProxy("photo_4k.png", "user");
        System.out.println("  Прокси создан, но картинка ещё не загружена");
        photo.display(); // загрузка + показ
        photo.display(); // только показ, из кэша

        Image secret = new ImageProxy("secret.png", "guest");
        secret.display(); // доступ запрещён
    }
}
