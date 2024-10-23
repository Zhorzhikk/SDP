public class TimePricingStrategy implements PricingStrategy {
    private double pricePerMinute;

    public TimePricingStrategy(double pricePerMinute) {
        this.pricePerMinute = pricePerMinute;
    }

    @Override
    public double calculatePrice(double distance, double time) {
        return time * pricePerMinute;
    }
}
