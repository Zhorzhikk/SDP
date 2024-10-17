public class ChangeDestinationCommand implements Command {
    private TaxiOrderManager taxiOrderManager;
    private int orderId;
    private String newDestination;

    public ChangeDestinationCommand(TaxiOrderManager taxiOrderManager, int orderId, String newDestination) {
        this.taxiOrderManager = taxiOrderManager;
        this.orderId = orderId;
        this.newDestination = newDestination;
    }

    @Override
    public void execute() {
        taxiOrderManager.changeDestination(orderId, newDestination);
    }
}
