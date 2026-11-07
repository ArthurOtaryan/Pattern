package adapter;

public interface MediaPlayer {
    void play(String fileName);
}

class Mp3Player implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("  [MP3] Playing: " + fileName);
    }
}
