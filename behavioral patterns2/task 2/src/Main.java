public class Main {
    public static void main(String[] args) {
        // Create an order (context)
        OrderContext order = new OrderContext();

        // Print initial state
        order.printStatus();

        // Move to the next state: Confirmed
        order.nextState();
        order.printStatus();

        // Move to the next state: On The Way
        order.nextState();
        order.printStatus();

        // Move to the next state: Finished
        order.nextState();
        order.printStatus();

        // Try to move beyond Finished state
        order.nextState();

        // Revert to the previous state: On The Way
        order.prevState();
        order.printStatus();
    }
}
