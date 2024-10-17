public class TaxiDispatchSystem {
    public static void processRequest(Request request) {
        // Create handlers
        Handler carAvailabilityHandler = new CarAvailabilityHandler();
        Handler balanceHandler = new BalanceHandler();
        Handler locationHandler = new LocationHandler();

        // Set the chain of responsibility
        carAvailabilityHandler.setNext(balanceHandler).setNext(locationHandler);

        // Start handling the request
        carAvailabilityHandler.handle(request);

        if (request.isSuccess) {
            System.out.println("Taxi dispatch successful!");
        } else {
            System.out.println("Taxi dispatch failed.");
        }
    }

    public static void main(String[] args) {
        // Example client request
        Request request = new Request(123, "Downtown", 50, 3);
        processRequest(request);
    }
}
