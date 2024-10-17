import java.util.ArrayList;
import java.util.List;

public class DriverCollection {
    private List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public DriverIterator iterator() {
        return new DriverIterator(drivers);
    }

    public List<Driver> getDrivers() {
        return drivers;
    }
}
