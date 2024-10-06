public static void main(String[] args) {
    // Создаем объекты
    Passenger passenger = new Passenger();
    Car car = new Car();  // Предположим, что есть класс Car
    CarSharing carSharing = new CarSharing(car);

    // Адаптируем CarSharing к TaxiService
    TaxiService taxiService = new CarSharingAdapter(carSharing);

    // Используем адаптированный сервис как службу такси
    taxiService.requestTaxi(passenger);
}
