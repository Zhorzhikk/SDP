public class Main {
    public static void main(String[] args) {
        // Create a trip with a distance of 15 km and time of 30 minutes
        Trip trip = new Trip(15, 30);

        // Use the Distance Pricing Strategy
        PricingStrategy distanceStrategy = new DistancePricingStrategy(2.5);  // $2.5 per km
        trip.setPricingStrategy(distanceStrategy);
        System.out.println("Price by Distance: $" + trip.calculatePrice());

        // Use the Time Pricing Strategy
        PricingStrategy timeStrategy = new TimePricingStrategy(0.5);  // $0.5 per minute
        trip.setPricingStrategy(timeStrategy);
        System.out.println("Price by Time: $" + trip.calculatePrice());

        // Use the Fixed Pricing Strategy
        PricingStrategy fixedStrategy = new FixedPricingStrategy(40);  // $40 fixed price
        trip.setPricingStrategy(fixedStrategy);
        System.out.println("Fixed Price: $" + trip.calculatePrice());
    }
}
