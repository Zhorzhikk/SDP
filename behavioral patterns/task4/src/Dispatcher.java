public class Dispatcher implements Colleague {
    private String name;
    private Mediator mediator;

    public Dispatcher(String name) {
        this.name = name;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Dispatcher " + name + " received: " + message);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void notifyClient(Client client, String message) {
        client.receiveMessage("Dispatcher: " + message);
    }

    public String getName() {
        return name;
    }
}
