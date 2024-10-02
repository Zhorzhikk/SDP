public abstract class Factory {
    // Abstract method for creating a Taxi
    public abstract Taxi createTaxi(String license);

    // Abstract method for creating a Driver
    public abstract Driver createDriver(String driverName);
}

public class StandardFactory extends Factory {
    @Override
    public Taxi createTaxi(String license) {
        // Create a StandardDriver instance
        Driver driver = createDriver("John Doe"); // You can change the name or make it parameterized
        // Return a new StandardTaxi with the created driver and the given license
        return new StandardTaxi(driver, license);
    }

    @Override
    public Driver createDriver(String driverName) {
        // Return a new StandardDriver with the specified driver name
        return new StandardDriver(driverName);
    }
}
public class PremiumFactory extends Factory {
    @Override
    public Taxi createTaxi(String license) {
        // Create a PremiumDriver instance
        Driver driver = createDriver("Jane Smith"); // You can change the name or make it parameterized
        // Return a new PremiumTaxi with the created driver and the given license
        return new PremiumTaxi(driver, license);
    }

    @Override
    public Driver createDriver(String driverName) {
        // Return a new PremiumDriver with the specified driver name
        return new PremiumDriver(driverName);
    }
}
