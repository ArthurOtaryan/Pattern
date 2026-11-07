package observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Observer ===");

        NewsAgency agency = new NewsAgency();
        Subscriber anna = new EmailSubscriber("anna@mail.ru");
        Subscriber bob = new TelegramSubscriber("bob_dev");

        agency.subscribe(anna);
        agency.subscribe(bob);
        agency.publish("Вышла Java 25");

        agency.unsubscribe(anna);
        agency.publish("Курс доллара изменился");
    }
}
