public class FixedPricingStrategy implements PricingStrategy {
    private double fixedPrice;

    public FixedPricingStrategy(double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    @Override
    public double calculatePrice(double distance, double time) {
        return fixedPrice;
    }
}
