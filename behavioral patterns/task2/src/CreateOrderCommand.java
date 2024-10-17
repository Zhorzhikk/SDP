public class CreateOrderCommand implements Command {
    private TaxiOrderManager taxiOrderManager;
    private int orderId;
    private String destination;

    public CreateOrderCommand(TaxiOrderManager taxiOrderManager, int orderId, String destination) {
        this.taxiOrderManager = taxiOrderManager;
        this.orderId = orderId;
        this.destination = destination;
    }

    @Override
    public void execute() {
        taxiOrderManager.createOrder(orderId, destination);
    }
}
