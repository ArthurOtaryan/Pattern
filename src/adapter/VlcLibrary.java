package adapter;

public class VlcLibrary {
    public void openFile(String path) {
        System.out.println("  [VLC] Opened file " + path);
    }

    public void startPlayback(int volume) {
        System.out.println("  [VLC] Playback started, volume " + volume + "%");
    }
}
