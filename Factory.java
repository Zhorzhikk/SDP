public abstract class Factory {
    // Factory method to create taxis, deferred to subclasses
    public abstract Taxi createTaxi(String driverName, String license);
}
public class StandardTaxiFactory extends Factory {
    // Implementing the factory method to create StandardTaxi instances
    @Override
    public Taxi createTaxi(String driverName, String license) {
        return new StandardTaxi(driverName, license);
    }
}
public class PremiumTaxiFactory extends Factory {
    // Implementing the factory method to create PremiumTaxi instances
    @Override
    public Taxi createTaxi(String driverName, String license) {
        return new PremiumTaxi(driverName, license);
    }
}
