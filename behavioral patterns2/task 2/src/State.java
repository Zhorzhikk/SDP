public interface State {
    void nextState(OrderContext context);
    void prevState(OrderContext context);
    void printStatus();
}
