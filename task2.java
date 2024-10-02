public class Driver implements Prototype<Driver> {
    private String name;
    private String carModel;
    private String carMake;
    private String age;
    private String experience;

    // Constructors
    public Driver(String name, String carModel) {
        this.name = name;
        this.carModel = carModel;
    }

    public Driver(String name, String carModel, String carMake) {
        this.name = name;
        this.carModel = carModel;
        this.carMake = carMake;
    }

    public Driver(String name, String carModel, String carMake, String age) {
        this.name = name;
        this.carModel = carModel;
        this.carMake = carMake;
        this.age = age;
    }

    public Driver(String name, String carModel, String carMake, String age, String experience) {
        this.name = name;
        this.carModel = carModel;
        this.carMake = carMake;
        this.age = age;
        this.experience = experience;
    }

    // Prototype method
    @Override
    public Driver clone() {
        return new Driver(this.name, this.carModel, this.carMake, this.age, this.experience);
    }

    // Optional: Override toString() for easy printing of Driver details
    @Override
    public String toString() {
        return "Driver{name='" + name + "', carModel='" + carModel + "', carMake='" + carMake + "', age='" + age + "', experience='" + experience + "'}";
    }

    public static void main(String[] args) {
        Driver originalDriver = new Driver("Alice", "Model S", "Tesla", "30", "5 years");
        Driver clonedDriver = originalDriver.clone();

        System.out.println(originalDriver); // Outputs: Driver{name='Alice', carModel='Model S', carMake='Tesla', age='30', experience='5 years'}
        System.out.println(clonedDriver);  // Outputs: Driver{name='Alice', carModel='Model S', carMake='Tesla', age='30', experience='5 years'}
    }
}
