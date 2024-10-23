public class DistancePricingStrategy implements PricingStrategy {
    private double pricePerKm;

    public DistancePricingStrategy(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    @Override
    public double calculatePrice(double distance, double time) {
        return distance * pricePerKm;
    }
}
