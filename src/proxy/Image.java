package proxy;

public interface Image {
    void display();
}

class RealImage implements Image {
    private final String fileName;

    RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("  [RealImage] Loading from disk: " + fileName + " (slow...)");
    }

    @Override
    public void display() {
        System.out.println("  [RealImage] Displaying: " + fileName);
    }
}
