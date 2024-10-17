public class BalanceHandler extends Handler {
    @Override
    public void handle(Request request) {
        if (request.balance >= 20) {
            System.out.println("Balance is sufficient. Passing to next handler...");
            if (nextHandler != null) {
                nextHandler.handle(request);
            }
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
