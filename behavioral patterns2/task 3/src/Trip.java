public class Trip {
    private PricingStrategy pricingStrategy;
    private double distance;  // in kilometers
    private double time;      // in minutes

    public Trip(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }

    // Set a new pricing strategy dynamically
    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculatePrice() {
        if (pricingStrategy == null) {
            throw new IllegalStateException("Pricing strategy must be set.");
        }
        return pricingStrategy.calculatePrice(distance, time);
    }

    public double getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }
}
