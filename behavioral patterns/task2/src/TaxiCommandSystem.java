public class TaxiCommandSystem {
    public static void main(String[] args) {
        // The Receiver
        TaxiOrderManager orderManager = new TaxiOrderManager();

        // The Invoker
        CommandInvoker invoker = new CommandInvoker();

        // Example Order ID
        int orderId = 101;

        // Command to create an order
        Command createOrder = new CreateOrderCommand(orderManager, orderId, "Downtown");
        invoker.setCommand(createOrder);
        invoker.executeCommand();  // Output: Order 101 created. Destination: Downtown

        // Command to change the destination
        Command changeDestination = new ChangeDestinationCommand(orderManager, orderId, "Airport");
        invoker.setCommand(changeDestination);
        invoker.executeCommand();  // Output: Order 101 destination changed to: Airport

        // Command to cancel the order
        Command cancelOrder = new CancelOrderCommand(orderManager, orderId);
        invoker.setCommand(cancelOrder);
        invoker.executeCommand();  // Output: Order 101 has been canceled.
    }
}
