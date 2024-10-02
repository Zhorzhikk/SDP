public class DriverManager {
    // Статическое поле для хранения единственного экземпляра
    private static DriverManager instance;

    // Приватный конструктор, чтобы предотвратить создание объектов извне
    private DriverManager() {
    }

    // Метод для получения экземпляра
    public static DriverManager getInstance() {
        if (instance == null) {
            // Создаем экземпляр только один раз
            instance = new DriverManager();
        }
        return instance;
    }

    public String findNearestDriver(String location) {
        System.out.println("Nearest driver found: " + "Driver1");
        return "Driver1";
    }
}


