package facade;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Facade ===");

        HomeTheaterFacade theater = new HomeTheaterFacade();
        theater.watchMovie("Интерстеллар"); // одна команда вместо девяти
        theater.endMovie();
    }
}
