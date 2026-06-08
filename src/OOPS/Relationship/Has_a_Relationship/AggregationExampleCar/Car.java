package OOPS.Relationship.Has_a_Relationship.AggregationExampleCar;

public class Car {
    private String brand;
    private String model;
    private long price;
    private boolean airbags;
    private boolean sunroof;
    private Driver driver;

    public Car(String brand, String model, long price, boolean airbags, boolean sunroof) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.airbags = airbags;
        this.sunroof = sunroof;
    }
    public void getCarInfo(){
        System.out.println("car [brand = " +brand +", model = "+model+", price = "+price+", airbags ="+(airbags?" YES":" NO") +", sunroof = "+(sunroof?" yes":" no")+"]");
    }
    public void addDriverCar(Driver driver){
        this.driver=driver;
    }
    public Driver getDriver(){
        return this.driver;
    }

}
