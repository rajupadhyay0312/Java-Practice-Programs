package OOPS.Relationship.Has_a_Relationship.AggregationExampleCar;

public class DriverExampleCarBike {
    public static void main(String[] args) {
        Car car = new Car("TATA", "NEXON", 1500000, true, true);
        car.getCarInfo();

        Driver driver = new Driver("Rajesh", 9876543212L, "DL-123456789");
        car.addDriverCar(driver);
        car.getDriver().getDriverInfo();

        Bike bike = new Bike("Hero", "Splendor", 90000);
        bike.getBikeInfo();
        bike.addDriveBike(driver);
        bike.getDriver().getDriverInfo();

    }
}
