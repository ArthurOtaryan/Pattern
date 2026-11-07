package observer;

import java.util.ArrayList;
import java.util.List;

/** Издатель (Subject): хранит подписчиков и уведомляет их. */
public class NewsAgency {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber s) {
        subscribers.add(s);
        System.out.println("  + подписался: " + s.name());
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
        System.out.println("  - отписался: " + s.name());
    }

    public void publish(String news) {
        System.out.println(" > Новость: " + news);
        for (Subscriber s : subscribers) {
            s.update(news);
        }
    }
}
