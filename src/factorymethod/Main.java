package factorymethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Factory Method ===");

        Logistics[] companies = { new RoadLogistics(), new SeaLogistics(), new AirLogistics() };
        for (Logistics logistics : companies) {
            logistics.planDelivery("10 tons of apples");
        }
    }
}
