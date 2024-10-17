public class CarAvailabilityHandler extends Handler {
    @Override
    public void handle(Request request) {
        if (request.carsAvailable > 0) {
            System.out.println("Car available. Passing to next handler...");
            if (nextHandler != null) {
                nextHandler.handle(request);
            }
        } else {
            System.out.println("No cars available.");
        }
    }
}
