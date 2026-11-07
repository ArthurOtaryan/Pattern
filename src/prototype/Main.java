package prototype;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Prototype ===");

        Rectangle original = new Rectangle(0, 0, "синий", 10, 20);
        original.addTag("кнопка");

        Rectangle clone = (Rectangle) original.copy();
        clone.moveTo(50, 50);
        clone.addTag("копия");

        System.out.println("  Оригинал: " + original);
        System.out.println("  Клон:     " + clone);
        System.out.println("  Разные объекты? " + (original != clone));

        ShapeRegistry registry = new ShapeRegistry();
        registry.register("big-red-circle", new Circle(0, 0, "красный", 100));
        Shape c1 = registry.get("big-red-circle");
        Shape c2 = registry.get("big-red-circle");
        c2.moveTo(10, 10);
        System.out.println("  Из реестра: " + c1 + " и " + c2);
    }
}
