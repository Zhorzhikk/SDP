public class Main {
    public static void main(String[] args) {
        // Create an order (subject)
        Order order = new Order();

        // Create clients (observers)
        Client client1 = new Client("Bob");
        Client client2 = new Client("Alice");

        // Add clients to the order's observer list
        order.addObserver(client1);
        order.addObserver(client2);

        // Change the order status, which notifies the clients
        order.setStatus("Your taxi is on the way.");
        order.setStatus("Your taxi has arrived.");
    }
}
