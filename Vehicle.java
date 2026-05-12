
public class Vehicle {

    // Static variable
    private static double fuelPrice = 102.50;

    // Instance variables
    private String vehicleId;
    private String ownerName;
    private String vehicleType;
    private String fuelType;
    private double tankCapacity;
    private int mileage;

    // Default constructor
    public Vehicle() {
        this.vehicleId = "UNKNOWN";
        this.ownerName = "Not Assigned";
        this.vehicleType = "Generic";
        this.fuelType = "Petrol";
        this.tankCapacity = 0.0;
        this.mileage = 0;
    }

    // Parameterized constructor
    public Vehicle(String vehicleId, String ownerName,
            String vehicleType, String fuelType,
            double tankCapacity, int mileage) {

        this.vehicleId = vehicleId;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.tankCapacity = tankCapacity;
        this.mileage = mileage;
    }

    // Static methods
    public static void setFuelPrice(double newPrice) {
        if (newPrice > 0) {
            fuelPrice = newPrice;
            System.out.println("Fuel price updated to ₹" + fuelPrice);
        } else {
            System.out.println("Invalid price");
        }
    }

    public static double getFuelPrice() {
        return fuelPrice;
    }

    // Instance methods
    public double calculateRefillCost() {
        return tankCapacity * fuelPrice;
    }

    public double calculateRange() {
        return tankCapacity * mileage;
    }

    public void displayDetails() {

        System.out.println("Vehicle ID     : " + vehicleId);
        System.out.println("Owner          : " + ownerName);
        System.out.println("Type           : " + vehicleType);
        System.out.println("Fuel Type      : " + fuelType);
        System.out.println("Tank Capacity  : " + tankCapacity + " L");
        System.out.println("Mileage        : " + mileage + " km/L");
        System.out.println("Fuel Price     : ₹" + fuelPrice);
        System.out.println("Full Refill    : ₹" + calculateRefillCost());
        System.out.println("Estimated Range: " + calculateRange() + " km");
        System.out.println();
    }

    // Getters and Setters
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String id) {
        this.vehicleId = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String type) {
        this.vehicleType = type;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String ft) {
        this.fuelType = ft;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double cap) {
        this.tankCapacity = cap;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mpg) {
        this.mileage = mpg;
    }
}
