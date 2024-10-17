public class Main {
    public static void main(String[] args) {
        // Create a collection of drivers
        DriverCollection driverCollection = new DriverCollection();

        // Add some drivers with different distances from the client
        driverCollection.addDriver(new Driver("John", 5.0));
        driverCollection.addDriver(new Driver("Alice", 2.3));
        driverCollection.addDriver(new Driver("Bob", 3.7));

        // Create the taxi service and assign the closest driver
        TaxiService taxiService = new TaxiService(driverCollection);
        taxiService.assignClosestDriver();
    }
}
