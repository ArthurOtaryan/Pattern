package adapter;

public class VlcAdapter implements MediaPlayer {
    private final VlcLibrary vlc;

    public VlcAdapter(VlcLibrary vlc) {
        this.vlc = vlc;
    }

    @Override
    public void play(String fileName) {
        vlc.openFile(fileName);
        vlc.startPlayback(80);
    }
}
