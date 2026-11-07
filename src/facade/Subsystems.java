package facade;

class Projector {
    void on() { System.out.println("  Projector: on"); }
    void off() { System.out.println("  Projector: off"); }
    void wideScreenMode() { System.out.println("  Projector: 16:9 mode"); }
}

class SoundSystem {
    void on() { System.out.println("  Sound: on"); }
    void off() { System.out.println("  Sound: off"); }
    void setVolume(int level) { System.out.println("  Sound: volume " + level); }
    void surround() { System.out.println("  Sound: 5.1 surround"); }
}

class Lights {
    void dim(int percent) { System.out.println("  Lights: brightness " + percent + "%"); }
}

class StreamingPlayer {
    void on() { System.out.println("  Player: on"); }
    void off() { System.out.println("  Player: off"); }
    void play(String movie) { System.out.println("  Player: playing \"" + movie + "\""); }
    void stop() { System.out.println("  Player: stopped"); }
}
