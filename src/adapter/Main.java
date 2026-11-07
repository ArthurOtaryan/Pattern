package adapter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Adapter ===");

        MediaPlayer mp3 = new Mp3Player();
        MediaPlayer vlc = new VlcAdapter(new VlcLibrary());

        for (String file : List.of("song.mp3", "movie.mkv", "clip.avi")) {
            MediaPlayer player = file.endsWith(".mp3") ? mp3 : vlc;
            player.play(file);
        }
    }
}
