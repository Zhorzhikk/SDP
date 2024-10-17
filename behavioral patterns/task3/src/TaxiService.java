public class TaxiService {
    private DriverCollection driverCollection;

    public TaxiService(DriverCollection driverCollection) {
        this.driverCollection = driverCollection;
    }

    public Driver assignClosestDriver() {
        DriverIterator iterator = driverCollection.iterator();
        if (!iterator.hasNext()) {
            System.out.println("No drivers available.");
            return null;
        }

        Driver closestDriver = iterator.next();  // Assume first driver as closest initially
        while (iterator.hasNext()) {
            Driver currentDriver = iterator.next();
            if (currentDriver.getDistanceFromClient() < closestDriver.getDistanceFromClient()) {
                closestDriver = currentDriver;
            }
        }

        System.out.println("Closest driver assigned: " + closestDriver);
        return closestDriver;
    }
}
