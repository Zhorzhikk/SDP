public abstract class OrderProcess {

    // Template method defining the steps for processing the order
    public final void processOrder() {
        checkAvailability();
        calculateCost();
        confirmOrder();
    }

    // Step 1: Check availability (can be overridden by subclasses)
    protected void checkAvailability() {
        System.out.println("Checking car availability...");
    }

    // Step 2: Calculate the cost (must be implemented by subclasses)
    protected abstract void calculateCost();

    // Step 3: Confirm the order (can be overridden by subclasses)
    protected void confirmOrder() {
        System.out.println("Order confirmed.");
    }
}
