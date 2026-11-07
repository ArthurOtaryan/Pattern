public class Main {
    public static void main(String[] args) {
        String[] none = new String[0];

        singleton.Main.main(none);
        separator();
        factorymethod.Main.main(none);
        separator();
        abstractfactory.Main.main(none);
        separator();
        builder.Main.main(none);
        separator();
        prototype.Main.main(none);
        separator();

        adapter.Main.main(none);
        separator();
        decorator.Main.main(none);
        separator();
        facade.Main.main(none);
        separator();
        proxy.Main.main(none);
        separator();

        observer.Main.main(none);
        separator();
        strategy.Main.main(none);
        separator();
        command.Main.main(none);
    }

    private static void separator() {
        System.out.println();
    }
}
