public class Request {
    public int clientId;
    public String location;
    public double balance;
    public int carsAvailable;
    public boolean isSuccess = false;

    public Request(int clientId, String location, double balance, int carsAvailable) {
        this.clientId = clientId;
        this.location = location;
        this.balance = balance;
        this.carsAvailable = carsAvailable;
    }
}
