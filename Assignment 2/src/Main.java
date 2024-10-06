// Адаптируем CarSharing к интерфейсу TaxiService
public class CarSharingAdapter implements TaxiService {
    private CarSharing carSharing;

    public CarSharingAdapter(CarSharing carSharing) {
        this.carSharing = carSharing;
    }

    @Override
    public void requestTaxi(Passenger passenger) {
        // Поскольку CarSharing работает с Driver, предположим, что Passenger можно трактовать как Driver
        Driver driver = new Driver(passenger.getName());  // Преобразуем пассажира в водителя
        carSharing.rentFreeCar(driver);  // Арендуем машину для водителя
    }
}
