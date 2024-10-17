public class CancelOrderCommand implements Command {
    private TaxiOrderManager taxiOrderManager;
    private int orderId;

    public CancelOrderCommand(TaxiOrderManager taxiOrderManager, int orderId) {
        this.taxiOrderManager = taxiOrderManager;
        this.orderId = orderId;
    }

    @Override
    public void execute() {
        taxiOrderManager.cancelOrder(orderId);
    }
}
