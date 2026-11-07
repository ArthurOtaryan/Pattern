package factorymethod;

public abstract class Logistics {

    protected abstract Transport createTransport();

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
