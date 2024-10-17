public class Driver implements Colleague {
    private String name;
    private Mediator mediator;

    public Driver(String name) {
        this.name = name;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Driver " + name + " received: " + message);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }
}
