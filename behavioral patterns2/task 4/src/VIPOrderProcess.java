public class VIPOrderProcess extends OrderProcess {

    private double distance;

    public VIPOrderProcess(double distance) {
        this.distance = distance;
    }

    @Override
    protected void calculateCost() {
        double cost = distance * 1.5;  // $1.5 per km for VIP clients (discounted)
        System.out.println("Cost calculated for VIP Order: $" + cost);
    }

    @Override
    protected void confirmOrder() {
        System.out.println("VIP Order confirmed with priority handling.");
    }
}
