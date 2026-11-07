package proxy;

/** Общий интерфейс реального объекта и заместителя. */
public interface Image {
    void display();
}

/** Реальный объект: «тяжёлая» загрузка с диска. */
class RealImage implements Image {
    private final String fileName;

    RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("  [RealImage] Загрузка с диска: " + fileName + " (долго...)");
    }

    @Override
    public void display() {
        System.out.println("  [RealImage] Показ: " + fileName);
    }
}
