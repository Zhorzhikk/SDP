public class Client implements Colleague {
    private String name;
    private Mediator mediator;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Client " + name + " received: " + message);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void requestTaxi() {
        System.out.println("Client " + name + " is requesting a taxi.");
        mediator.assignDriver(this);
    }

    public String getName() {
        return name;
    }
}
