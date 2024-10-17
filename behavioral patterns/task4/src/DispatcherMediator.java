import java.util.List;
import java.util.ArrayList;

public class DispatcherMediator implements Mediator {
    private List<Driver> availableDrivers = new ArrayList<>();
    private Dispatcher dispatcher;

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public void addDriver(Driver driver) {
        availableDrivers.add(driver);
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {
        if (colleague instanceof Client) {
            dispatcher.receiveMessage("Client: " + message);
        } else if (colleague instanceof Driver) {
            dispatcher.receiveMessage("Driver: " + message);
        }
    }

    @Override
    public void assignDriver(Client client) {
        if (availableDrivers.isEmpty()) {
            client.receiveMessage("No drivers available.");
            return;
        }

        Driver assignedDriver = availableDrivers.remove(0); // Assign the first available driver
        assignedDriver.receiveMessage("You have been assigned to a client.");
        client.receiveMessage("Driver " + assignedDriver.getName() + " has been assigned to you.");
    }
}
