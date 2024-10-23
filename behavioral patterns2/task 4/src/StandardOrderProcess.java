public class StandardOrderProcess extends OrderProcess {

    private double distance;

    public StandardOrderProcess(double distance) {
        this.distance = distance;
    }

    @Override
    protected void calculateCost() {
        double cost = distance * 2.0;  // $2 per km
        System.out.println("Cost calculated for Standard Order: $" + cost);
    }
}
