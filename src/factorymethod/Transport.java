package factorymethod;

public interface Transport {
    void deliver(String cargo);
}

class Truck implements Transport {
    @Override
    public void deliver(String cargo) {
        System.out.println("  [Truck] delivering by road: " + cargo);
    }
}

class Ship implements Transport {
    @Override
    public void deliver(String cargo) {
        System.out.println("  [Ship] delivering by sea: " + cargo);
    }
}

class Plane implements Transport {
    @Override
    public void deliver(String cargo) {
        System.out.println("  [Plane] delivering by air: " + cargo);
    }
}
