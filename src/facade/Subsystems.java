package facade;

/*
 * Сложная подсистема домашнего кинотеатра.
 * Каждый класс имеет свой API, и клиенту пришлось бы управлять ими всеми вручную.
 */

class Projector {
    void on() { System.out.println("  Проектор: включён"); }
    void off() { System.out.println("  Проектор: выключен"); }
    void wideScreenMode() { System.out.println("  Проектор: режим 16:9"); }
}

class SoundSystem {
    void on() { System.out.println("  Звук: включён"); }
    void off() { System.out.println("  Звук: выключен"); }
    void setVolume(int level) { System.out.println("  Звук: громкость " + level); }
    void surround() { System.out.println("  Звук: объёмный 5.1"); }
}

class Lights {
    void dim(int percent) { System.out.println("  Свет: яркость " + percent + "%"); }
}

class StreamingPlayer {
    void on() { System.out.println("  Плеер: включён"); }
    void off() { System.out.println("  Плеер: выключен"); }
    void play(String movie) { System.out.println("  Плеер: воспроизводит \"" + movie + "\""); }
    void stop() { System.out.println("  Плеер: стоп"); }
}
