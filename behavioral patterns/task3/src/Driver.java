public class Driver {
    private String name;
    private double distanceFromClient; // Distance in kilometers

    public Driver(String name, double distanceFromClient) {
        this.name = name;
        this.distanceFromClient = distanceFromClient;
    }

    public String getName() {
        return name;
    }

    public double getDistanceFromClient() {
        return distanceFromClient;
    }

    @Override
    public String toString() {
        return "Driver{name='" + name + "', distanceFromClient=" + distanceFromClient + " km}";
    }
}
