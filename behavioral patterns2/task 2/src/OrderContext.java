public class OrderContext {
    private State currentState;

    public OrderContext() {
        // Order is initially in the Created state
        this.currentState = new CreatedState();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void nextState() {
        currentState.nextState(this); // Transition to the next state
    }

    public void prevState() {
        currentState.prevState(this); // Transition to the previous state
    }

    public void printStatus() {
        currentState.printStatus(); // Print the current state status
    }
}
