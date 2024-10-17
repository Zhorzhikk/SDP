public class LocationHandler extends Handler {
    @Override
    public void handle(Request request) {
        if ("Downtown".equals(request.location) || "Airport".equals(request.location)) {
            System.out.println("Location '" + request.location + "' is serviceable. Processing request...");
            request.isSuccess = true;
        } else {
            System.out.println("Location '" + request.location + "' is not serviceable.");
        }
    }
}
