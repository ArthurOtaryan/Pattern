package observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Observer ===");

        NewsAgency agency = new NewsAgency();
        Subscriber anna = new EmailSubscriber("anna@example.com");
        Subscriber bob = new TelegramSubscriber("bob_dev");

        agency.subscribe(anna);
        agency.subscribe(bob);
        agency.publish("Java 25 released");

        agency.unsubscribe(anna);
        agency.publish("Exchange rates updated");
    }
}
