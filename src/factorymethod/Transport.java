package factorymethod;

/** Продукт: общий интерфейс транспорта. */
public interface Transport {
    void deliver(String cargo);
}

/** Конкретный продукт: грузовик. */
class Truck implements Transport {
    @Override
    public void deliver(String cargo) {
        System.out.println("  [Грузовик] везёт по дороге: " + cargo);
    }
}

/** Конкретный продукт: корабль. */
class Ship implements Transport {
    @Override
    public void deliver(String cargo) {
        System.out.println("  [Корабль] везёт по морю: " + cargo);
    }
}

/** Конкретный продукт: самолёт. */
class Plane implements Transport {
    @Override
    public void deliver(String cargo) {
        System.out.println("  [Самолёт] везёт по воздуху: " + cargo);
    }
}
