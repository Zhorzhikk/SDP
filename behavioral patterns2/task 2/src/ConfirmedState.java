public class ConfirmedState implements State {
    @Override
    public void nextState(OrderContext context) {
        context.setState(new OnTheWayState());
        System.out.println("Taxi is on the way.");
    }

    @Override
    public void prevState(OrderContext context) {
        context.setState(new CreatedState());
        System.out.println("Order returned to Created state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is in the Confirmed state.");
    }
}
