package observer;

/** Наблюдатель. */
public interface Subscriber {
    void update(String news);
    String name();
}

class EmailSubscriber implements Subscriber {
    private final String email;

    EmailSubscriber(String email) { this.email = email; }

    @Override
    public void update(String news) {
        System.out.println("    [Email -> " + email + "] " + news);
    }

    @Override
    public String name() { return email; }
}

class TelegramSubscriber implements Subscriber {
    private final String username;

    TelegramSubscriber(String username) { this.username = username; }

    @Override
    public void update(String news) {
        System.out.println("    [Telegram -> @" + username + "] " + news);
    }

    @Override
    public String name() { return "@" + username; }
}
