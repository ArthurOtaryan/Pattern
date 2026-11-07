package prototype;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Prototype ===");

        Rectangle original = new Rectangle(0, 0, "blue", 10, 20);
        original.addTag("button");

        Rectangle clone = (Rectangle) original.copy();
        clone.moveTo(50, 50);
        clone.addTag("copy");

        System.out.println("  Original: " + original);
        System.out.println("  Clone:    " + clone);
        System.out.println("  Different objects? " + (original != clone));

        ShapeRegistry registry = new ShapeRegistry();
        registry.register("big-red-circle", new Circle(0, 0, "red", 100));
        Shape c1 = registry.get("big-red-circle");
        Shape c2 = registry.get("big-red-circle");
        c2.moveTo(10, 10);
        System.out.println("  From registry: " + c1 + " and " + c2);
    }
}
