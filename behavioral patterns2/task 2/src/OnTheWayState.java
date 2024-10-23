public class OnTheWayState implements State {
    @Override
    public void nextState(OrderContext context) {
        context.setState(new FinishedState());
        System.out.println("Order completed.");
    }

    @Override
    public void prevState(OrderContext context) {
        context.setState(new ConfirmedState());
        System.out.println("Taxi returned to the Confirmed state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is in the On The Way state.");
    }
}
