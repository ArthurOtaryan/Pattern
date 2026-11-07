package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber s) {
        subscribers.add(s);
        System.out.println("  + subscribed: " + s.name());
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
        System.out.println("  - unsubscribed: " + s.name());
    }

    public void publish(String news) {
        System.out.println(" > News: " + news);
        for (Subscriber s : subscribers) {
            s.update(news);
        }
    }
}
