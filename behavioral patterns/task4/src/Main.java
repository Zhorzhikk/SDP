public class Main {
    public static void main(String[] args) {
        // Create the mediator
        DispatcherMediator mediator = new DispatcherMediator();

        // Create dispatcher
        Dispatcher dispatcher = new Dispatcher("Central Dispatcher");
        dispatcher.setMediator(mediator);
        mediator.setDispatcher(dispatcher);

        // Create drivers
        Driver driver1 = new Driver("John");
        driver1.setMediator(mediator);
        Driver driver2 = new Driver("Alice");
        driver2.setMediator(mediator);
        mediator.addDriver(driver1);
        mediator.addDriver(driver2);

        // Create client
        Client client = new Client("Bob");
        client.setMediator(mediator);

        // Client requests a taxi
        client.requestTaxi();

        // Second client requests a taxi
        Client client2 = new Client("Eve");
        client2.setMediator(mediator);
        client2.requestTaxi();

        // If no drivers are available
        Client client3 = new Client("Charlie");
        client3.setMediator(mediator);
        client3.requestTaxi();
    }
}
