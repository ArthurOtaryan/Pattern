package singleton;

/**
 * Singleton через enum — самый простой и надёжный способ
 * (защищён от рефлексии и сериализации).
 */
public enum Logger {
    INSTANCE;

    private int counter = 0;

    public void log(String message) {
        counter++;
        System.out.println("  [LOG #" + counter + "] " + message);
    }
}
