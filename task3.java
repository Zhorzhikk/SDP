public class Driver {
    private String name;
    private String carModel;
    private String licenseNumber;
    private int experienceYears;
    private boolean isAvailable;

    // Private constructor to enforce the use of Builder
    private Driver(DriverBuilder builder) {
        this.name = builder.name;
        this.carModel = builder.carModel;
        this.licenseNumber = builder.licenseNumber;
        this.experienceYears = builder.experienceYears;
        this.isAvailable = builder.isAvailable;
    }

    // Getter methods (optional, for accessing the fields)
    public String getName() {
        return name;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Driver{name='" + name + "', carModel='" + carModel + "', licenseNumber='" + licenseNumber + "', experienceYears=" + experienceYears + ", isAvailable=" + isAvailable + "}";
    }

    // Static inner Builder class
    public static class DriverBuilder {
        private String name;
        private String carModel;
        private String licenseNumber;
        private int experienceYears;
        private boolean isAvailable;

        // Mandatory parameters in the constructor
        public DriverBuilder(String name, String carModel) {
            this.name = name;
            this.carModel = carModel;
        }

        // Optional parameters with setter methods
        public DriverBuilder setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }

        public DriverBuilder setExperienceYears(int experienceYears) {
            this.experienceYears = experienceYears;
            return this;
        }

        public DriverBuilder setIsAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

        // Build method to create the Driver object
        public Driver build() {
            return new Driver(this);
        }
    }

    // Example usage
    public static void main(String[] args) {
        Driver driver = new Driver.DriverBuilder("John Doe", "Model X")
                .setLicenseNumber("ABC123")
                .setExperienceYears(5)
                .setIsAvailable(true)
                .build();

        System.out.println(driver);
        // Output: Driver{name='John Doe', carModel='Model X', licenseNumber='ABC123', experienceYears=5, isAvailable=true}
    }
}

