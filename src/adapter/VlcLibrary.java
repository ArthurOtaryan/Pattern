package adapter;

/**
 * Сторонняя библиотека (адаптируемый класс) с несовместимым интерфейсом.
 * Её код мы менять не можем.
 */
public class VlcLibrary {
    public void openFile(String path) {
        System.out.println("  [VLC] Открыт файл " + path);
    }

    public void startPlayback(int volume) {
        System.out.println("  [VLC] Воспроизведение, громкость " + volume + "%");
    }
}
