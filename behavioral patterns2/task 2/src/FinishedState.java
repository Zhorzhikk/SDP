public class FinishedState implements State {
    @Override
    public void nextState(OrderContext context) {
        System.out.println("Order is already in the Finished state.");
    }

    @Override
    public void prevState(OrderContext context) {
        context.setState(new OnTheWayState());
        System.out.println("Order returned to On The Way state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is in the Finished state.");
    }
}
