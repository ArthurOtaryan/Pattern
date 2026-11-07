package prototype;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    protected int x;
    protected int y;
    protected String color;

    protected Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    protected Shape(Shape source) {
        this(source.x, source.y, source.color);
    }

    public abstract Shape copy();

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle extends Shape {
    private final int radius;

    Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    private Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Shape copy() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle(" + x + "," + y + ", " + color + ", r=" + radius + ")";
    }
}

class Rectangle extends Shape {
    private final int width;
    private final int height;
    private final List<String> tags;

    Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
        this.tags = new ArrayList<>();
    }

    private Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
        this.tags = new ArrayList<>(source.tags);
    }

    void addTag(String tag) {
        tags.add(tag);
    }

    @Override
    public Shape copy() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle(" + x + "," + y + ", " + color + ", " + width + "x" + height + ", tags=" + tags + ")";
    }
}
