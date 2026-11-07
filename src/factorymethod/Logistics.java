package factorymethod;

/**
 * Создатель. Объявляет фабричный метод createTransport(),
 * который подклассы переопределяют.
 */
public abstract class Logistics {

    /** Фабричный метод. */
    protected abstract Transport createTransport();

    /** Бизнес-логика не знает, какой конкретно транспорт используется. */
    public void planDelivery(String cargo) {
        Transport transport = createTransport();
        transport.deliver(cargo);
    }
}

class RoadLogistics extends Logistics {
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}

class SeaLogistics extends Logistics {
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}

class AirLogistics extends Logistics {
    @Override
    protected Transport createTransport() {
        return new Plane();
    }
}
