package singleton;

public enum Logger {
    INSTANCE;

    private int counter = 0;

    public void log(String message) {
        counter++;
        System.out.println("  [LOG #" + counter + "] " + message);
    }
}
