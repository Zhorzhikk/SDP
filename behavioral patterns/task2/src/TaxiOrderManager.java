public class TaxiOrderManager {
    public void createOrder(int orderId, String destination) {
        System.out.println("Order " + orderId + " created. Destination: " + destination);
    }

    public void cancelOrder(int orderId) {
        System.out.println("Order " + orderId + " has been canceled.");
    }

    public void changeDestination(int orderId, String newDestination) {
        System.out.println("Order " + orderId + " destination changed to: " + newDestination);
    }
}
