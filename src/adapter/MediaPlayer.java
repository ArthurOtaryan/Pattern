package adapter;

/** Целевой интерфейс, который ожидает клиент. */
public interface MediaPlayer {
    void play(String fileName);
}

/** Старый плеер, который умеет только mp3. */
class Mp3Player implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("  [MP3] Играет: " + fileName);
    }
}
