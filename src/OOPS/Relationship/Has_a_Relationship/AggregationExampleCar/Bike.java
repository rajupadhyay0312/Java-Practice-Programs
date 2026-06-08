package OOPS.Relationship.Has_a_Relationship.AggregationExampleCar;

public class Bike {
    private String brand;
    private String model;
    private double price;
    private Driver driver;

    public Bike(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void getBikeInfo() {
        System.out.println("Bike [brand = " + brand + ", model = " + model + ", price = " + price + "]");
    }

    public void addDriveBike(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return this.driver;
    }

}
