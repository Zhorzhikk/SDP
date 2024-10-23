import java.util.ArrayList;
import java.util.List;

public class Order implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String status;

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();  // Notify all observers when the status changes
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }

    public String getStatus() {
        return status;
    }
}