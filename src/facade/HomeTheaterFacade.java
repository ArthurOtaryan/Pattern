package facade;

public class HomeTheaterFacade {
    private final Projector projector = new Projector();
    private final SoundSystem sound = new SoundSystem();
    private final Lights lights = new Lights();
    private final StreamingPlayer player = new StreamingPlayer();

    public void watchMovie(String movie) {
        System.out.println(" > Getting ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        sound.on();
        sound.surround();
        sound.setVolume(7);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println(" > Shutting down the home theater...");
        player.stop();
        player.off();
        sound.off();
        projector.off();
        lights.dim(100);
    }
}
