public class CreatedState implements State {
    @Override
    public void nextState(OrderContext context) {
        context.setState(new ConfirmedState());
        System.out.println("Order confirmed.");
    }

    @Override
    public void prevState(OrderContext context) {
        System.out.println("The order is in its initial state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is in the Created state.");
    }
}
