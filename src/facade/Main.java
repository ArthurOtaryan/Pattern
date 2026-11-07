package facade;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Facade ===");

        HomeTheaterFacade theater = new HomeTheaterFacade();
        theater.watchMovie("Interstellar");
        theater.endMovie();
    }
}
